package phisco.streams.polimi.it;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.kstream.internals.TimeWindow;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;
import phisco.streams.polimi.it.avro.SJSONtKey;
import phisco.streams.polimi.it.avro.URI;

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

        Map serdeConfig = Collections.singletonMap(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG,
                "http://localhost:8081");

        StreamsBuilder builder = new StreamsBuilder();

        KStream<SJSONtKey, SJSONTriple> s0 = builder.stream("sorted_triples");

        class SJSONTripleStream{

            KStream<SJSONtKey,SJSONTriple> s;

            public SJSONTripleStream(KStream<SJSONtKey,SJSONTriple> stream){
                this.s = stream;
            }

            @SuppressWarnings("unchecked")
            public KTable<Windowed<SJSONtKey>, SJSONTripleMap> getTable(String name, Predicate<SJSONtKey, SJSONTriple> filter, Windows window){
                return this.s.filter(filter)
                        .groupByKey()
                        .windowedBy(window)
                        .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                                new Aggregator<SJSONtKey,SJSONTriple, SJSONTripleMap>() {
                                    @Override
                                    public SJSONTripleMap apply(SJSONtKey k, SJSONTriple v1, SJSONTripleMap map) {
                                        Map<String, List<SJSONTriple>> d = map.getData();
                                        if (d.containsKey(name)) {
                                            d.get(name).add(v1);
                                        } else {
                                            List<SJSONTriple> a = new ArrayList<>();
                                            a.add(v1);
                                            d.put(name, a);
                                        }
                                        return map;
                                    }
                                });
            }

        }
        SJSONTripleStream st0 = new SJSONTripleStream(s0);
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t1 = st0.getTable("t1",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#procedure"),
                TimeWindows.of(Duration.ofSeconds(10)));

        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t2 = st0.getTable("t2",
                (k, v) -> v.getP().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
                        && v.getO() instanceof URI
                        && ((URI) v.getO()).getValue().equals("http://knoesis.wright.edu/ssw/ont/weather.owl#RainfallObservation"),
                TimeWindows.of(Duration.ofSeconds(10)));



        t1.join(t2, (v1, v2) ->{
                v1.getData().forEach((k, v) ->
                            v2.getData().merge(k, v, (value1, value2) ->
                            {
                                value1.addAll(value2);
                                return value1;
                            }));
        return v2;
    }
                ).toStream().print(Printed.toSysOut());

        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
