package phisco.streams.polimi.it.executor;

import org.apache.kafka.streams.kstream.Aggregator;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.apache.kafka.streams.kstream.Windows;
import phisco.streams.polimi.it.Algebra.LogicalWindow;
import phisco.streams.polimi.it.Algebra.Window;
import phisco.streams.polimi.it.Algebra.WindowNode;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KafkaWindowNode extends KafkaNode {
    public KafkaWindowNode(KafkaExecutor executor, WindowNode node) {
        super(node);
        this.table(executor.nodes().get(node.children().get(0).name()).stream().groupByKey()
                .windowedBy(window(node.window()))
                .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                        this.aggregator(node.name())
                ));
    }

    public static Aggregator<SJSONtKey, SJSONTriple, SJSONTripleMap> aggregator(String name){
        if (name.equals("")){
            return (k,v,map) -> map;
        }
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

    public Windows window(Window w){
        if (w instanceof LogicalWindow){
            return TimeWindows.of(((LogicalWindow) w).duration()).advanceBy(((LogicalWindow) w).step());
        }
        return null;
    }
}
