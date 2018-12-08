package phisco.streams.polimi.it;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.processor.To;
import phisco.streams.polimi.it.avro.*;

import java.time.Duration;
import java.util.*;

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
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "metamorphosys10");
        props.put(StreamsConfig.CLIENT_ID_CONFIG, "metamorphosys10");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

        StreamsBuilder builder = new StreamsBuilder();

        //FROM partitioned by subject (known)
        KStream<SJSONtKey, SJSONTriple> s0 = builder.stream("sorted_triples");
        SJSONTripleStream st0 = new SJSONTripleStream(s0);

        //BGP1
        // first triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t1 = st0.getTable("t1",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#procedure"),
                TimeWindows.of(Duration.ofSeconds(10)));

        // second triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t2 = st0.getTable("t2",
                (k, v) -> v.getP().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
                        && (v.getO().getValue().equals("http://knoesis.wright.edu/ssw/ont/weather.owl#RainfallObservation")),
                TimeWindows.of(Duration.ofSeconds(10)));

        // third triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t3 = st0.getTable("t3",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#result"),
                TimeWindows.of(Duration.ofSeconds(10)));

        // fourth triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t5 = st0.getTable("t5",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#floatValue"),
                TimeWindows.of(Duration.ofSeconds(10)));

        // fifth triple pattern
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t6 = st0.getTable("t6",
                (k, v) -> v.getP().equals("http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#uom"),
                TimeWindows.of(Duration.ofSeconds(10)));


        // join first, second, third by subject
        KTable<Windowed<SJSONtKey>,SJSONTripleMap> t4 = t1
                .join(t2, SJSONTripleStream.SJSONtripleMapsJoiner())
                .join(t3, SJSONTripleStream.SJSONtripleMapsJoiner())
                // filter out if not all 3 sources have been joined
                .filter((k,v)->{ Map d = v.getData();
                    return d.containsKey("t1") && d.containsKey("t2") && d.containsKey("t3");})
                // rekey needed for the next join
                // due to previous grouping, flatmap is needded in order to split the aggregates per partition
                .toStream()
                .flatMap((k,v) -> {
                    List result = new ArrayList();
                    List<SJSONTriple> t3s = v.getData().get("t3");
                    Map map = v.getData();
                    t3s.forEach((el)->{
                        map.put("t3",Arrays.asList(el));
                        result.add(new KeyValue<>(new SJSONtKey(el.getO().getValue().toString()),new SJSONTripleMap(map)));
                    });
                    return result;
                })
                // toStream looses timestamps, need to extract one again
                .transform(() -> new Transformer<SJSONtKey, SJSONTripleMap,Object>() {
                    private ProcessorContext context;
                    @Override
                    public void init(ProcessorContext processorContext) {
                        this.context = processorContext;
                    }

                    @Override
                    public Object transform(SJSONtKey k, SJSONTripleMap v) {
                        context.forward(k,v, To.all().withTimestamp(v.getData().get("t3").get(0).getTs()));
                        return null;
                    }

                    @Override
                    public void close() {

                    }
                })
                //regroup by the new key not loosing origin information
                .groupByKey()
                .windowedBy(TimeWindows.of(Duration.ofSeconds(10)))
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        new Aggregator<SJSONtKey,SJSONTripleMap,SJSONTripleMap>() {
                            @Override
                            public SJSONTripleMap apply(SJSONtKey k1, SJSONTripleMap v1, SJSONTripleMap map) {
                                Map<String,List<SJSONTriple>> d = map.getData();
                                v1.getData().forEach((k,v)->{
                                    d.merge(k, v, (List oldVal, List newVal) -> { Set old = new HashSet<>(oldVal); old.addAll(newVal); return new ArrayList<>(old);});
                                });
                                return map;
                            }}
                );

        // join fourth and fifth triple patter
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> t7 = t5.join(t6,SJSONTripleStream.SJSONtripleMapsJoiner())
                // filter out if not all incoming streams have been used
                .filter((k,v)->{ Map d = v.getData();
                    return d.containsKey("t5") && d.containsKey("t6");});

        // join result of first and second join and prepare for final result
        t7.join(t4,SJSONTripleStream.SJSONtripleMapsJoiner())
                .toStream()
                // rekey over windows to print per windows
                .map((k,v)-> new KeyValue<>(new SJSONtKey(k.window().start()+","+k.window().end()),v))
                // extract timestamp lost due to the toStream
                .transform(() -> new Transformer<SJSONtKey, SJSONTripleMap,KeyValue<SJSONtKey,SJSONTripleMap>>() {
                    private ProcessorContext context;
                    @Override
                    public void init(ProcessorContext processorContext) {
                        this.context = processorContext;
                    }

                    @Override
                    public KeyValue transform(SJSONtKey k, SJSONTripleMap v) {
                        context.forward(k,v, To.all().withTimestamp(v.getData().get("t3").get(0).getTs()));
                        return null;
                    }

                    @Override
                    public void close() {

                    }
                })
                // group by window
                .groupByKey()
                // add windowed, could be omitted, windowing is already in the key
                .windowedBy(TimeWindows.of(Duration.ofSeconds(10)))
                // aggregate by window
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        new Aggregator<SJSONtKey,SJSONTripleMap,SJSONTripleMap>() {
                            @Override
                            public SJSONTripleMap apply(SJSONtKey k1, SJSONTripleMap v1, SJSONTripleMap map) {
                                Map<String,List<SJSONTriple>> d = map.getData();
                                v1.getData().forEach((k,v)->{
                                    d.merge(k, v, (List oldVal, List newVal) ->
                                    {
                                        Set old = new HashSet<>(oldVal); old.addAll(newVal);
                                        return new ArrayList<>(old);
                                    });
                                });
                                return map;
                            }}
                )
                // PROJECT
                .mapValues((v)-> {
                    Map<String,List<SJSONTriple>> d = v.getData();
                    Set result = new HashSet<>();
                    d.get("t1").forEach(t1el ->
                            d.get("t5").forEach(t5el ->
                                    d.get("t6").forEach(t6el ->
                                                    /*result.add(Arrays.asList(t1el
                                                            ,t5el,t6el))*/
                                            result.add(Arrays.asList(t1el.getO().getValue()
                                                    ,t5el.getO().getValue(),t6el.getO().getValue()))
                                    )));
                    return result; })
                .toStream().print(Printed.toSysOut());

        // stream the whole thing
        KafkaStreams streams = new KafkaStreams(builder.build(), props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
