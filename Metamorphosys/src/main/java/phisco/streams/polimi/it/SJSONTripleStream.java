package phisco.streams.polimi.it;

import org.apache.kafka.streams.kstream.*;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
