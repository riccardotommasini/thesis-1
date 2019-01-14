package phisco.streams.polimi.it.executor;


import lombok.ToString;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.misc.Pair;
import org.apache.kafka.streams.kstream.Printed;
import phisco.streams.polimi.it.Algebra.Key;
import phisco.streams.polimi.it.Algebra.ProjectNode;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static phisco.streams.polimi.it.Algebra.Key.*;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class KafkaProjectionNode extends KafkaNode {
    public KafkaProjectionNode(KafkaExecutor executor, ProjectNode node){
        super(node);
        final List<Pair<String,Function<List<SJSONTriple>,List<String>>>> checks = node.projectVars().stream()
                .filter(p -> node.vars().containsKey(p))
                .map(p -> (Map.Entry<String,HashSet<Key>>) node.vars().get(p).entrySet().toArray()[0])
                .map(p -> {
                    switch ((Key) p.getValue().toArray()[0]){
                        case S:
                            return new Pair<String,Function<List<SJSONTriple>,List<String>>>(p.getKey(), (Function<List<SJSONTriple>,List<String>>) l -> l.stream().map(s -> s.getS()).collect(Collectors.toList()));
                        case P:
                            return new Pair<String,Function<List<SJSONTriple>,List<String>>>(p.getKey(), (Function<List<SJSONTriple>,List<String>>) l -> l.stream().map(s -> s.getP()).collect(Collectors.toList()));
                        case O:
                            return new Pair<String,Function<List<SJSONTriple>,List<String>>>(p.getKey(), (Function<List<SJSONTriple>,List<String>>) l -> l.stream().map(s -> s.getO().getValue().toString()).collect(Collectors.toList()));
                    }
                    return null;
                }).collect(Collectors.<Pair<String,Function<List<SJSONTriple>,List<String>>>>toList());
        executor.nodes().get(node.children().get(0).name()).table().mapValues(( v) -> checks.stream()
                .map(c -> new Pair(c.a,c.b.apply((List<SJSONTriple>)v))).collect(Collectors.toList())).toStream().print(Printed.toSysOut());
    }
}
