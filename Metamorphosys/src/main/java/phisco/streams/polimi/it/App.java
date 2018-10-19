package phisco.streams.polimi.it;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.avro.data.Json;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.connect.json.JsonDeserializer;
import org.apache.kafka.connect.json.JsonSerializer;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.processor.TimestampExtractor;

import java.io.IOException;
import java.util.List;
import java.util.Properties;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "metamorphosys");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        props.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, 0);
        Serde<JsonNode> serde = Serdes.serdeFrom(new JsonSerializer(),new JsonDeserializer());
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        StreamsBuilder builder = new StreamsBuilder();
        KStream streaming_data = builder.stream("streaming-data", Consumed.with(Serdes.String(),serde).withTimestampExtractor((record, prev) ->
                serde.deserializer().deserialize("", record.value().toString().getBytes()).get("date").asLong()));
        KStream static_data = builder.stream("static-data", Consumed.with(Serdes.String(),serde).withTimestampExtractor((record, prev) ->
                serde.deserializer().deserialize("", record.value().toString().getBytes()).get("ENDDATETIME").asLong()));
        //static_data.print(Printed.toSysOut());
        //streaming_data.print(Printed.toSysOut());
        KStream joined = streaming_data.join(static_data, new ValueJoiner() {
            @Override
            public Object apply(Object value1, Object value2) {
                ObjectNode jNode = JsonNodeFactory.instance.objectNode();
                jNode.putAll(((JsonNode)value1).);
                ((JsonNode)value1).fields().forEachRemaining((e) -> jNode.put(e.getKey(), e.getValue()));
                ((JsonNode)value2).fields().forEachRemaining((e) -> jNode.put(e.getKey(), e.getValue()));
                return jNode.;
            }
        }, JoinWindows.of(1000), Joined.with(Serdes.String(),serde,serde));
        joined.print(Printed.toSysOut());
        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
