package phisco.streams.polimi.it;

import org.apache.kafka.streams.kstream.*;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.util.*;

@SuppressWarnings("unchecked")
public class SJSONTripleStream{

    KStream<SJSONtKey, SJSONTriple> s;

    public SJSONTripleStream(KStream<SJSONtKey,SJSONTriple> stream){
        this.s = stream;
    }

    public KTable<Windowed<SJSONtKey>, SJSONTripleMap> getTable(String name, Predicate<SJSONtKey, SJSONTriple> filter, Windows window){
        return this.s.filter(filter)
                .groupByKey()
                .windowedBy(window)
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        this.aggregator(name)
                        );
    }

    public static Aggregator<SJSONtKey,SJSONTriple, SJSONTripleMap> aggregator(String name){
        return (k,v1, map)-> {
            Map<String, List<SJSONTriple>> d = map.getData();
            if (d.containsKey(name)) {
                d.get(name).add(v1);
            } else {
                List<SJSONTriple> a = new ArrayList<>();
                a.add(v1);
                d.put(name, a);
            }
            return map;
        };
    }

    public static ValueJoiner<SJSONTripleMap, SJSONTripleMap, SJSONTripleMap> SJSONtripleMapsJoiner(List<String> keep_keys_left, List<String> keep_keys_right){
        return (v1, v2) ->{
            keep_keys_left.forEach(key ->
                    v2.getData().merge(key, v1.getData().get(key), (value1, value2) ->
                    {
                        Set res = new HashSet(value1);
                        res.addAll(value2);
                        return new ArrayList<>(res);
                    })
            );
            keep_keys_right.forEach(key ->
                    v1.getData().merge(key, v2.getData().get(key), (value1, value2) ->
                    {
                        Set res = new HashSet(value1);
                        res.addAll(value2);
                        return new ArrayList<>(res);
                    })
            );

            return v2;
        };
    }
}
