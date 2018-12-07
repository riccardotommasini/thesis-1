package phisco.streams.polimi.it;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import io.confluent.kafka.streams.serdes.avro.GenericAvroSerde;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONtKey;
import phisco.streams.polimi.it.avro.URI;

import java.sql.Time;
import java.time.Duration;
import java.util.*;


/**
 * Hello world!
 *
 */
public class StreamingTriplesExample
{
    public static void main( String[] args )
    {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "metamorphosys");
        props.put(StreamsConfig.CLIENT_ID_CONFIG, "metamorphosys");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

        Map serdeConfig = Collections.singletonMap(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG,
                "http://localhost:8081");

        StreamsBuilder builder = new StreamsBuilder();
        SpecificAvroSerde keySerde = new SpecificAvroSerde<>();
        keySerde.configure(serdeConfig,true);
        ArrayListSerde serde = new ArrayListSerde<>(new SpecificAvroSerde<>());
        serde.configure(serdeConfig,false);

        KStream<SJSONtKey, SJSONTriple> s0 = builder.stream("sorted_triples");
        @SuppressWarnings("unchecked")
        KTable<Windowed<SJSONtKey>, ArrayList<SJSONTriple>> t1 = s0
                .filter((k,v) -> v.getP().toString().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#procedure") )
                .groupByKey()
                .windowedBy(TimeWindows.of(Duration.ofSeconds(10)))
                .aggregate(ArrayList<SJSONTriple>::new, (k, v1, list) -> {list.add(v1); return list;},
                        Materialized.with(keySerde, serde)
                );
        @SuppressWarnings("unchecked")
        KTable<Windowed<SJSONtKey>, ArrayList<SJSONTriple>> t2 = s0
                .filter((k,v) -> v.getP().toString().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
                        && (v.getO() instanceof URI)
                        && ((URI) v.getO()).getValue().toString().equals("http://knoesis.wright.edu/ssw/ont/weather.owl#RainfallObservation"))
                .groupByKey()
                .windowedBy(TimeWindows.of(Duration.ofSeconds(10)))
                .aggregate(ArrayList<SJSONTriple>::new, (k, v1, list) -> {list.add(v1); return list;},
                        Materialized.with(keySerde, serde)
                );
        @SuppressWarnings("unchecked")
        KTable<Windowed<SJSONtKey>, ArrayList<SJSONTriple>> t3 = s0
                .filter((k,v) -> v.getP().toString().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#result") ).groupByKey()
                .windowedBy(TimeWindows.of(Duration.ofSeconds(10)))
                .aggregate(ArrayList<SJSONTriple>::new, (k, v1, list) -> {list.add(v1); return list;},
                        Materialized.with(keySerde, serde)
                );

        t1.join(t2, (v1, v2) -> {v1.addAll(v2); return v1;} ).toStream().print(Printed.toSysOut());

        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
