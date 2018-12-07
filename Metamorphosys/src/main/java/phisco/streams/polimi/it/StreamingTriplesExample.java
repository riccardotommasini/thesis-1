package phisco.streams.polimi.it;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.kstream.internals.TimeWindow;
import phisco.streams.polimi.it.avro.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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

        StreamsBuilder builder = new StreamsBuilder();

        KStream<SJSONtKey, SJSONTriple> s0 = builder.stream("sorted_triples");

        SJSONTripleStream st0 = new SJSONTripleStream(s0);
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t1 = st0.getTable("t1",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#procedure"),
                TimeWindows.of(Duration.ofSeconds(10)));

        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t2 = st0.getTable("t2",
                (k, v) -> v.getP().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
                        && (v.getO().getValue().equals("http://knoesis.wright.edu/ssw/ont/weather.owl#RainfallObservation")),
                TimeWindows.of(Duration.ofSeconds(10)));

        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t3 = st0.getTable("t3",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#result"),
                TimeWindows.of(Duration.ofSeconds(10)));

        ValueJoiner<SJSONTripleMap, SJSONTripleMap, SJSONTripleMap> SJSONtripleMapsJoiner = (v1, v2) ->{
            v1.getData().forEach((k, v) ->
                    v2.getData().merge(k, v, (value1, value2) ->
                    {
                        value1.addAll(value2);
                        return value1;
                    }));
            return v2;
        };



        t1.join(t2, SJSONtripleMapsJoiner).join(t3, SJSONtripleMapsJoiner).toStream()
                .flatMap((k,v) -> {
                    List result = new ArrayList();
                    v.getData().forEach((k1,v1) ->{
                        v1.forEach((SJSONTriple el) -> {
                            Object value =el.getO().getValue();
                            if (value instanceof String) {
                                result.add(new KeyValue<>(new SJSONtKey((String)value),el));
                            }
                        });
                    } );
                    return result;
                }).print(Printed.toSysOut());


        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
