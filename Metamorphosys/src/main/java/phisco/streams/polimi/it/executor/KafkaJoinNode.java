package phisco.streams.polimi.it.executor;

import org.antlr.v4.runtime.misc.Pair;
import org.apache.commons.collections.map.SingletonMap;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Windowed;
import phisco.streams.polimi.it.Algebra.JoinNode;
import phisco.streams.polimi.it.Algebra.JoinType;
import phisco.streams.polimi.it.Algebra.WindowNode;
import phisco.streams.polimi.it.SJSONTripleStream;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.util.*;
import java.util.stream.Collectors;

public class KafkaJoinNode extends KafkaNode {
    public KafkaJoinNode(KafkaExecutor executor, JoinNode node){
        super(node);
       if (node.joinType() != JoinType.BLOCKING) {
           Map<String, Boolean> rekeyNeeded = node.vars().get(node.joinKeys().toArray()[0])
                   .entrySet().stream()
                   .filter(e -> node.scanKeys().containsKey(e.getKey()))
                   .map(e -> new HashMap.SimpleEntry<>(e.getKey(),
                           !node.scanKeys().get(e.getKey()).containsAll(e.getValue())))
                   .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
           KTable<Windowed<SJSONtKey>, SJSONTripleMap> left = executor.nodes()
                   .get(node.children().get(0).name())
                   .table();
           KTable<Windowed<SJSONtKey>, SJSONTripleMap> right = executor.nodes()
                   .get(node.children().get(1).name()).table();
           Map<String, Boolean> rekeyPerChildren = node.children().stream()
                   .flatMap(c -> c.vars().get(node.joinKeys().toArray()[0]).entrySet().stream()
                           .filter(e -> node.scanKeys().containsKey(e.getKey()))
                           .map(e -> new Pair<>(c.name(),rekeyNeeded.get(e.getKey()))))
                   .collect(Collectors.toMap(e -> e.a, e -> e.b, (n,o) -> n && o));
           //if (rekeyNeeded.get(node.children().get(0).name()))
           if (rekeyPerChildren.get(node.children().get(0).name()))
                left = left.toStream()
                       .flatMap((k, v) -> {
                           List<KeyValue<Windowed<SJSONtKey>, SJSONTripleMap>> result = new ArrayList();
                           Map<String, List<SJSONTriple>> map = v.getData();
                           List<SJSONTriple> results_list = map.get("result");
                           SJSONTripleMap new_map = new SJSONTripleMap(new SingletonMap("procedure", map.get("procedure")));
                           results_list.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(el.getO().getValue().toString()), k.window()), new_map)));
                           return result;
                       })
                       .groupByKey(Grouped.with(executor.windowedSerde(), executor.valueSpecificAvroSerde()))
                       .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                               SJSONTripleStream.aggregatorPostRekey
                       );
           if (rekeyPerChildren.get(node.children().get(1).name()))
               right = right.toStream()
                       .flatMap((k, v) -> {
                           List<KeyValue<Windowed<SJSONtKey>, SJSONTripleMap>> result = new ArrayList();
                           Map<String, List<SJSONTriple>> map = v.getData();
                           List<SJSONTriple> results_list = map.get("result");
                           SJSONTripleMap new_map = new SJSONTripleMap(new SingletonMap("procedure", map.get("procedure")));
                           results_list.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(el.getO().getValue().toString()), k.window()), new_map)));
                           return result;
                       })
                       .groupByKey(Grouped.with(executor.windowedSerde(), executor.valueSpecificAvroSerde()))
                       .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                               SJSONTripleStream.aggregatorPostRekey
                       );
           this.table(left.join(right, SJSONTripleStream.SJSONtripleMapsJoiner(new ArrayList<>(node.joinKeys()), new ArrayList<>(node.joinKeys()))));
       }
    }
}
