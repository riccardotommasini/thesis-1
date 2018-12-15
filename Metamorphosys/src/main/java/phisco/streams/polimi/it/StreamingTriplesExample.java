package phisco.streams.polimi.it;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.commons.collections.map.SingletonMap;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import phisco.streams.polimi.it.avro.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class StreamingTriplesExample
{

    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {

        /*
            SELECT DISTINCT ?sensor ?value ?uom
            WHERE {
                {?observation om-owl:procedure ?sensor ;            [1]
				              a weather:RainfallObservation ;       [2]
				              om-owl:result ?result}                [3]
                {?result 	om-owl:floatValue ?value ;              [4]
  			                om-owl:uom ?uom }                       [5]
}
         */

        //properties
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "metamorphosys-example-5");
        props.put(StreamsConfig.CLIENT_ID_CONFIG, "metamorphosys-example-5");
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

        Serde<Windowed<SJSONtKey>> windowedSerde = new Serdes.WrapperSerde<Windowed<SJSONtKey>>(new TimeWindowedSerializer<SJSONtKey>(keySpecificAvroSerde.serializer()),
                new TimeWindowedDeserializer<>(keySpecificAvroSerde.deserializer(),Duration.ofSeconds(10).toMillis()));
        // WindowedSerdes.TimeWindowedSerde is bugged and do not deserialize correctly the window length
//        Serde<Windowed<SJSONtKey>> windowedSerde = new WindowedSerdes.TimeWindowedSerde(keySpecificAvroSerde);


        StreamsBuilder builder = new StreamsBuilder();

        //FROM partitioned by subject (known)
        KStream<SJSONtKey, SJSONTriple> s0 = builder.stream("sorted_triples");
        SJSONTripleStream st0 = new SJSONTripleStream(s0);

        //BGP1
        // first triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t1 = st0.getTable("sensor",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#procedure"),
                TimeWindows.of(Duration.ofSeconds(10)));

        // second triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t2 = st0.getTable("",
                (k, v) -> v.getP().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
                        && (v.getO().getValue().equals("http://knoesis.wright.edu/ssw/ont/weather.owl#RainfallObservation")),
                TimeWindows.of(Duration.ofSeconds(10)));

        // third triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t3 = st0.getTable("result",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#result"),
                TimeWindows.of(Duration.ofSeconds(10)));

        //BGP2
        // fourth triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t5 = st0.getTable("value",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#floatValue"),
                TimeWindows.of(Duration.ofSeconds(10)));

        // fifth triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t6 = st0.getTable("uom",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#uom"),
                TimeWindows.of(Duration.ofSeconds(10)));


        // join first, second, third by subject
        KTable<Windowed<SJSONtKey>,SJSONTripleMap> t4 = t1
                .join(t2, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("sensor"),Arrays.asList()))
                .join(t3, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("sensor"),Arrays.asList()))
//                .filter((k,v)->{ Map d = v.getData();
//                    return d.containsKey("sensor");})
                // rekey needed for the next join
                // due to previous grouping, flatmap is needded in order to split the aggregates per partition
                .toStream()
                .flatMap((k,v) -> {
                        List < KeyValue < Windowed < SJSONtKey >, SJSONTripleMap >> result = new ArrayList();
                        List<SJSONTriple> t3s = v.getData().get("result");
                        Map<String,List<SJSONTriple>> map = v.getData();
                        //SJSONTripleMap t1_object = new SJSONTripleMap(new SingletonMap("sensor",map.get("t1").stream().map(t1_el -> t1_el.getO().getValue().toString()).collect(Collectors.toSet())));
                        SJSONTripleMap t1_object = new SJSONTripleMap(new SingletonMap("sensor",map.get("sensor")));
                        t3s.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(el.getO().getValue().toString()), k.window()), t1_object)));
                        return result;
                })
                //regroup by the new key not loosing origin information
                .groupByKey(Grouped.with(windowedSerde,valueSpecificAvroSerde))
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                       SJSONTripleStream.aggregatorPostRekey
                );

        // join fourth and fifth triple patter
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t7 = t5.join(t6,SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("value"),Arrays.asList("uom")))
                // filter out if not all incoming streams have been used
                .filter((k,v)->{ Map d = v.getData();
                    return d.containsKey("value") && d.containsKey("uom");});

        // join result of first and second join and prepare for final result
        KTable<Windowed<SJSONtKey>,SJSONTripleMap>  t8 = t7.join(t4,SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("value","uom"),Arrays.asList("sensor")))
                .toStream()
                // rekey over windows to print per windows
                .map((k,v)-> {
                    KeyValue newKV = new KeyValue<>(new Windowed<>(k.key(), k.window()), v);
                    return newKV;
                })
                // group by window
                .groupByKey(Grouped.with(windowedSerde,valueSpecificAvroSerde))
                // aggregate by window
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        SJSONTripleStream.aggregatorPostRekey
                );

                t8.mapValues(v -> {
                    Map<String,List<SJSONTriple>> d = v.getData();
                    Map<String,List<String>> res = new HashMap<>();
                    res.put("sensor", new ArrayList<>(d.get("sensor").stream().map((el) -> el.getO().getValue().toString()).collect(Collectors.toSet())));
                    res.put("value", new ArrayList<>(d.get("value").stream().map((el) -> el.getO().getValue().toString()).collect(Collectors.toSet())));
                    res.put("uom", new ArrayList<>(d.get("uom").stream().map((el) -> el.getO().getValue().toString()).collect(Collectors.toSet())));
                    return res;
                })
                        // here construct can be done
                .toStream().print(Printed.toSysOut());

        // stream the whole thing
        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
