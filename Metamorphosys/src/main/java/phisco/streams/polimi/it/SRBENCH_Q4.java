package phisco.streams.polimi.it;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.commons.collections.map.SingletonMap;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class SRBENCH_Q4
{

    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {

        /*
        PREFIX om-owl: <http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#>
        PREFIX weather: <http://knoesis.wright.edu/ssw/ont/weather.owl#>
        PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>

        SELECT ISTREAM ?sensor (AVG(?windSpeed) AS ?averageWindSpeed)
                       (AVG(?temperature) AS ?averageTemperature)
        FROM NAMED WINDOW ON STREAM srbench:observations [RANGE PT3H SLIDE PT10M] AS :win
        WHERE {
          WINDOW :win {
              ?temperatureObservation om-owl:procedure ?sensor ;
                                      a weather:TemperatureObservation ;
                                      om-owl:result ?temperatureResult .
              ?temperatureResult om-owl:floatValue ?temperature ;
                                 om-owl:uom ?uom .
              FILTER(?temperature > "32"^^xsd:float )
              ?windSpeedObservation om-owl:procedure ?sensor ;
                                    a weather:WindSpeedObservation ;
                                    om-owl:result [ om-owl:floatValue ?windSpeed ]  .
        }}
        GROUP BY ?sensor
        ------
        PREFIX om-owl: <http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#>
        PREFIX weather: <http://knoesis.wright.edu/ssw/ont/weather.owl#>
        PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>

        SELECT ?sensor (AVG(?windSpeed) AS ?averageWindSpeed)
                       (AVG(?temperature) AS ?averageTemperature)
        WHERE {
          ?temperatureObservation om-owl:procedure ?sensor ;                        [1]
                                  a weather:TemperatureObservation ;                [2]
                                  om-owl:result ?temperatureResult .                [3]
          ?temperatureResult om-owl:floatValue ?temperature ;                       [4]
                             om-owl:uom ?uom .                                      [5]
          FILTER(?temperature > "32"^^xsd:float)                                    [6]
          ?windSpeedObservation om-owl:procedure ?sensor ;                          [7]
                                a weather:WindSpeedObservation ;                    [8]
                                om-owl:result [ om-owl:floatValue ?windSpeed ]  .   [9] [10]
        }
        GROUP BY ?sensor

         */

        //properties
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "metamorphosys-SRBENCH-Q4-1");
        props.put(StreamsConfig.CLIENT_ID_CONFIG, "metamorphosys-SRBENCH-Q4-1");
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
                new TimeWindowedDeserializer<>(keySpecificAvroSerde.deserializer(),Duration.ofHours(1).toMillis()));
        // WindowedSerdes.TimeWindowedSerde is bugged and do not deserialize correctly the window length
//        Serde<Windowed<SJSONtKey>> windowedSerde = new WindowedSerdes.TimeWindowedSerde(keySpecificAvroSerde);


        StreamsBuilder builder = new StreamsBuilder();

        //FROM partitioned by subject (known)
        KStream<SJSONtKey, SJSONTriple> s0 = builder.stream("sorted_triples");
        SJSONTripleStream st0 = new SJSONTripleStream(s0);

        // 1 + 7
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> procedure = st0.getTable("procedure",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#procedure"),
                TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofMinutes(10)));

        // 2
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> type_temperatureObservation = st0.getTable("",
                (k, v) -> v.getP().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
                        && (v.getO().getValue().equals("http://knoesis.wright.edu/ssw/ont/weather.owl#TemperatureObservation")),
                TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofMinutes(10)));

        // 3 + 9
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> results = st0.getTable("result",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#result"),
                TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofMinutes(10)));

        // 4 + 6
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> temperatures = st0.getTable("temperature",
                (k, v) -> {
                    if (v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#floatValue")){
                        Object o = v.getO().getValue();
                        if (o instanceof Float) {
                            return (((Float) o) > 32.0);
                        }
                    }
                    return false;
                },
                TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofMinutes(10)));

        // 5
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> uoms = st0.getTable("",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#uom"),
                TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofMinutes(10)));

        // 8
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> type_windspeedObservation = st0.getTable("",
                (k, v) -> v.getP().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
                        && (v.getO().getValue().equals("http://knoesis.wright.edu/ssw/ont/weather.owl#WindSpeedObservation")),
                TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofMinutes(10)));

        // 10
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> floats = st0.getTable("speed",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#floatValue"),
                TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofMinutes(10)));


        KTable<Windowed<SJSONtKey>,SJSONTripleMap> t1 = procedure
                // join 1, 2 -> keep 1
                .join(type_temperatureObservation, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("procedure"),Arrays.asList()))
                // join (join 1, 2), 3 -> keep 1, 3
                .join(results, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("procedure"),Arrays.asList("result")))
                // rekey to 3.getO
                .toStream()
                .flatMap((k,v) -> {
                        List < KeyValue < Windowed < SJSONtKey >, SJSONTripleMap >> result = new ArrayList();
                        Map<String,List<SJSONTriple>> map = v.getData();
                        List<SJSONTriple> results_list = map.get("result");
                        SJSONTripleMap new_map = new SJSONTripleMap(new SingletonMap("procedure",map.get("procedure")));
                        results_list.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(el.getO().getValue().toString()), k.window()), new_map)));
                        return result;
                })
                .groupByKey(Grouped.with(windowedSerde,valueSpecificAvroSerde))
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                       SJSONTripleStream.aggregatorPostRekey
                ); // results in a Ktable K = windowed(result), value = map("procedure": [triples with o = sensor])

        // join 4 + 6 , 5 -> keep temperature from 4+6
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t2 = temperatures.join(uoms,SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("temperature"),Arrays.asList()))
                // join (join 4 + 6, 5), (join (join 1,2),3) -> keep temperature temperature from left, procedure right
                .join(t1,SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("temperature"),Arrays.asList("procedure")))
                .toStream()
                .flatMap((k, v) ->{
                    List < KeyValue < Windowed < SJSONtKey >, SJSONTripleMap >> result = new ArrayList();
                    Map<String,List<SJSONTriple>> map = v.getData();
                    List<SJSONTriple> procedures_list = map.get("procedure");
                    SJSONTripleMap new_map = new SJSONTripleMap(new SingletonMap("temperature",map.get("temperature")));
                    procedures_list.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(el.getO().getValue().toString()), k.window()), new_map)));
                    return result;

                })
                .groupByKey(Grouped.with(windowedSerde,valueSpecificAvroSerde))
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        SJSONTripleStream.aggregatorPostRekey
                );

        KTable<Windowed<SJSONtKey>,SJSONTripleMap> t3 = procedure
                // join 1, 8 -> keep procedure from right
                .join(type_windspeedObservation, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("procedure"),Arrays.asList()))
                // join (join 1,8), 3 -> keep procedure left, result right
                .join(results, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("procedure"),Arrays.asList("result")))
                // rekey result
                .toStream()
                .flatMap((k,v) -> {
                    List < KeyValue < Windowed < SJSONtKey >, SJSONTripleMap >> result = new ArrayList();
                    Map<String,List<SJSONTriple>> map = v.getData();
                    List<SJSONTriple> results_list = map.get("result");
                    SJSONTripleMap new_map= new SJSONTripleMap(new SingletonMap("procedure",map.get("procedure")));
                    results_list.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(el.getO().getValue().toString()), k.window()), new_map)));
                    return result;
                })
                .groupByKey(Grouped.with(windowedSerde,valueSpecificAvroSerde))
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        SJSONTripleStream.aggregatorPostRekey
                )
                // join 10, (rekey (join (join 1,8), 3) -> keep procedure left, temperature right
                .join(floats, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("procedure"), Arrays.asList("speed")))
                ; // results in a Ktable K = windowed(result), value = map("procedure": [triples with o = sensor])

        KTable<Windowed<SJSONtKey>,SJSONTripleMap> t4 = t3
                .toStream()
                .flatMap((k, v) ->{
                    List < KeyValue < Windowed < SJSONtKey >, SJSONTripleMap >> result = new ArrayList();
                    Map<String,List<SJSONTriple>> map = v.getData();
                    List<SJSONTriple> procedures_list = map.get("procedure");
                    SJSONTripleMap new_map = new SJSONTripleMap(new SingletonMap("speed",map.get("speed")));
                    procedures_list.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(el.getO().getValue().toString()), k.window()), new_map)));
                    return result;

                })
                .groupByKey(Grouped.with(windowedSerde,valueSpecificAvroSerde))
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        SJSONTripleStream.aggregatorPostRekey
                );


//        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t5 = t2.join(t4, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("temperature"), Arrays.asList("speed")));
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t5 = t2.join(t4, SJSONTripleStream.SJSONtripleMapsJoiner(Arrays.asList("temperature"), Arrays.asList("speed")));
        t5.mapValues(v -> {
            Map<String,List<SJSONTriple>> d = v.getData();
            Map<String,Double> res = new HashMap<>();
            res.put("speed", d.get("speed").stream().mapToDouble((el) -> (Float)(el.getO().getValue())).average().getAsDouble());
            res.put("temperature", d.get("temperature").stream().mapToDouble((el) -> (Float)(el.getO().getValue())).average().getAsDouble());
            return res;
        }).toStream().print(Printed.toSysOut());


        // stream the whole thing
        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
