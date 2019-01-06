package phisco.streams.polimi.it.executor;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.TimeWindowedDeserializer;
import org.apache.kafka.streams.kstream.TimeWindowedSerializer;
import org.apache.kafka.streams.kstream.Windowed;
import phisco.streams.polimi.it.Algebra.FilterNode;
import phisco.streams.polimi.it.Algebra.RelNode;
import phisco.streams.polimi.it.Algebra.ScanNode;
import phisco.streams.polimi.it.Algebra.WindowNode;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

@Accessors(fluent = true)
public class KafkaExecutor extends Executor {
    @Getter
    private Map<String, KafkaNode> nodes;
    @Getter
    private StreamsBuilder builder;
    @Getter
    private Serde<Windowed<SJSONtKey>> windowedSerde;
    private Properties props;

    public KafkaExecutor() {
        nodes = new HashMap<>();
        props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "metamorphosys-SRBENCH-Q1");
        props.put(StreamsConfig.CLIENT_ID_CONFIG, "metamorphosys-SRBENCH-Q1");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(StreamsConfig.DEFAULT_WINDOWED_KEY_SERDE_INNER_CLASS, SpecificAvroSerde.class);
        props.put(StreamsConfig.DEFAULT_WINDOWED_VALUE_SERDE_INNER_CLASS, SpecificAvroSerde.class);
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");


        final Map<String, String> serdeConfig = Collections.singletonMap("schema.registry.url",
                "http://localhost:8081");

        SpecificAvroSerde keySpecificAvroSerde = new SpecificAvroSerde();
        SpecificAvroSerde valueSpecificAvroSerde = new SpecificAvroSerde();
        keySpecificAvroSerde.configure(serdeConfig,true);
        valueSpecificAvroSerde.configure(serdeConfig,false);

        windowedSerde = new Serdes.WrapperSerde<Windowed<SJSONtKey>>(new TimeWindowedSerializer<SJSONtKey>(keySpecificAvroSerde.serializer()),
                new TimeWindowedDeserializer<>(keySpecificAvroSerde.deserializer(), Duration.ofHours(1).toMillis()));
        // WindowedSerdes.TimeWindowedSerde is bugged and do not deserialize correctly the window length
//        Serde<Windowed<SJSONtKey>> windowedSerde = new WindowedSerdes.TimeWindowedSerde(keySpecificAvroSerde);


        builder = new StreamsBuilder();
    }

    @Override
    public KafkaNode walk(RelNode root) {
        List<KafkaNode> children = new ArrayList<>();
        if (root.children() != null)
            children.addAll(root.children().stream()
                    .map(c -> walk(c))
                    .collect(Collectors.toList()));
        return translate(root, children);

    }

    private KafkaNode translate(RelNode node, List<KafkaNode> children){
        KafkaNode kafkaNode = new KafkaNode();
        if (node instanceof ScanNode){
            kafkaNode = new KafkaScanNode(this, (ScanNode) node);
        } else if (node instanceof WindowNode){
            kafkaNode = new KafkaWindowNode(this, (WindowNode) node);
        } else if (node instanceof FilterNode){
            kafkaNode = new KafkaFilterNode(this, (FilterNode) node);
        }
        if ( kafkaNode != null)
            nodes.put(node.name(), kafkaNode);
        return kafkaNode != null ? kafkaNode : children.get(0);
    }
}
