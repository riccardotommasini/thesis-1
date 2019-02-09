package phisco.streams.polimi.it.executor;


import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.var;
import org.antlr.v4.runtime.misc.Pair;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.processor.PunctuationType;
import org.apache.kafka.streams.processor.Punctuator;
import org.apache.kafka.streams.state.KeyValueStore;
import phisco.streams.polimi.it.Algebra.Key;
import phisco.streams.polimi.it.Algebra.ProjectNode;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;

import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class KafkaProjectionNode extends KafkaNode {
    public KafkaProjectionNode(KafkaExecutor executor, ProjectNode node){
        super(node);
        final List<Pair<Pair<String, String>,Function<List<SJSONTriple>,List<String>>>> checks = node.projectVars().stream()
                .filter(p -> node.vars().containsKey(p))
                .map(k -> {
                    var p = (Map.Entry<String,HashSet<Key>>) node.vars().get(k).entrySet().toArray()[0];
                    switch ((Key) p.getValue().toArray()[0]){
                        case S:
                            return new Pair<Pair<String,String>,Function<List<SJSONTriple>,List<String>>>(new Pair(p.getKey(),k),
                                    l -> l.stream().map(s -> s.getS()).collect(Collectors.toList()));
                        case P:
                            return new Pair<Pair<String,String>,Function<List<SJSONTriple>,List<String>>>(new Pair(p.getKey(),k),
                                    l -> l.stream().map(s -> s.getP()).collect(Collectors.toList()));
                        case O:
                            return new Pair<Pair<String,String>,Function<List<SJSONTriple>,List<String>>>(new Pair(p.getKey(),k),
                                    l -> l.stream().map(s -> s.getO().getValue().toString()).collect(Collectors.toList()));
                    }
                    return null;
                }).collect(Collectors.toList());

        executor.nodes().get(node.children().get(0).name())
                .table()
                //.filter((k,v) -> ((Map) v).keySet().size() == node.projectVars().size())
                .mapValues((v) -> checks.parallelStream()
                        .map(c -> new Pair(c.a.b,
                                c.b.apply(((SJSONTripleMap)v).getData().get(c.a.a))))
                        .collect(Collectors.<Pair<String,List<String>>,String,List<String>>toMap(c -> c.a, c -> c.b,
                                (oldList, newList) -> new ArrayList(oldList){{addAll(newList);}})))
                .toStream()
                .print(Printed.toSysOut());
    }
}
