package phisco.streams.polimi.it;
import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import org.apache.kafka.streams.KafkaStreams;
import com.fasterxml.jackson.databind.JsonNode;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.connect.json.JsonDeserializer;
import org.apache.kafka.connect.json.JsonSerializer;
import org.apache.kafka.streams.StreamsBuilder;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.logging.log4j.core.util.IOUtils;

import java.io.FileInputStream;
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
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "meta");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, 0);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        //props.put("schema.registry.url", "http://localhost:8081");

        final Serde<SJSONTriple> valueSpecificAvroSerde = new SpecificAvroSerde<>(new CachedSchemaRegistryClient("http://kafka-k8s:8081", 10));
        final Map<String, String> serdeConfig = Collections.singletonMap("schema.registry.url",
                "http://kafka-schema-registry-k8s:8081");
        valueSpecificAvroSerde.configure(serdeConfig,false);
        StreamsBuilder builder = new StreamsBuilder();
        KStream<String, SJSONTriple> s0 = builder.stream("sorted_triples_2", Consumed.with(new Serdes.StringSerde(), valueSpecificAvroSerde));
        s0.print(Printed.toSysOut());

        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
