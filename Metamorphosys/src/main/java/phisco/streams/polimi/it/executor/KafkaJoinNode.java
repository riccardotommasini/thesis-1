package phisco.streams.polimi.it.executor;

import com.google.common.util.concurrent.UncheckedExecutionException;
import lombok.val;
import org.antlr.v4.runtime.misc.Pair;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Windowed;
import phisco.streams.polimi.it.Algebra.JoinNode;
import phisco.streams.polimi.it.Algebra.JoinType;
import phisco.streams.polimi.it.Algebra.Key;
import phisco.streams.polimi.it.SJSONTripleStream;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONTripleMap;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static phisco.streams.polimi.it.Algebra.Key.S;

public class KafkaJoinNode extends KafkaNode {
    public KafkaJoinNode(KafkaExecutor executor, JoinNode node){
        super(node);
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> left = executor.nodes()
                .get(node.children().get(0).name())
                .table();
        KTable<Windowed<SJSONtKey>, SJSONTripleMap> right = executor.nodes()
                .get(node.children().get(1).name()).table();
       if (node.joinType() != JoinType.BLOCKING) {
           Map<String, Boolean> rekeyNeeded = node.vars().get(node.joinKeys().toArray()[0])
                   .entrySet().stream()
                   .filter(e -> node.scanKeys().containsKey(e.getKey()))
                   .map(e -> new HashMap.SimpleEntry<>(e.getKey(),
                           !node.scanKeys().get(e.getKey()).containsAll(e.getValue())))
                   .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

           Map<String, Boolean> rekeyPerChildren = node.children().stream()
                   .flatMap(c -> c.vars().get(node.joinKeys().toArray()[0]).entrySet().stream()
                           .filter(e -> node.scanKeys().containsKey(e.getKey()))
                           .map(e -> new Pair<>(c.name(),rekeyNeeded.get(e.getKey()))))
                   .collect(Collectors.toMap(e -> e.a, e -> e.b, (n,o) -> n && o));
           if (rekeyPerChildren.get(node.children().get(0).name()))
                left = left.toStream()
                        .flatMap((k,v) -> {
                            List < KeyValue < Windowed < SJSONtKey >, SJSONTripleMap >> result = new ArrayList();
                            List<SJSONTriple> results = v.getData().get(node.children().get(0).name());
                            SJSONTripleMap t1_object = new SJSONTripleMap(new HashMap<String, List<SJSONTriple>>(v.getData()){{remove(node.children().get(0).name());}});
                            Function<SJSONTriple,String> keyExtractor = el -> el.toString();
                            switch ((Key)node.vars().get(node.joinKeys().toArray()[0]).<Key>get(node.children().get(0).name()).<Key>toArray()[0]){
                                case S:
                                    keyExtractor = el -> el.getS();
                                    break;
                                case P:
                                    keyExtractor = el -> el.getP();
                                    break;
                                case O:
                                    keyExtractor = el -> el.getO().getValue().toString();
                                    break;

                            }
                            val keyExtractorFinal = keyExtractor;
                            results.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(keyExtractorFinal.apply(el)), k.window()), t1_object)));
                            return result;
                        })
                       .groupByKey(Grouped.with(executor.windowedSerde(), executor.valueSpecificAvroSerde()))
                       .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                               SJSONTripleStream.aggregatorPostRekey
                       );
           if (rekeyPerChildren.get(node.children().get(1).name()))
               right = right.toStream()
                       .flatMap((k,v) -> {
                           List < KeyValue < Windowed < SJSONtKey >, SJSONTripleMap >> result = new ArrayList();
                           List<SJSONTriple> results = v.getData().get(node.children().get(1).name());
                           SJSONTripleMap t1_object = new SJSONTripleMap(new HashMap<String, List<SJSONTriple>>(v.getData()){{remove(node.children().get(1).name());}});
                           Function<SJSONTriple,String> keyExtractor = el -> el.toString();
                           switch ((Key)node.vars().get(node.joinKeys().toArray()[0]).<Key>get(node.children().get(0).name()).<Key>toArray()[0]){
                               case S:
                                   keyExtractor = el -> el.getS();
                                   break;
                               case P:
                                   keyExtractor = el -> el.getP();
                                   break;
                               case O:
                                   keyExtractor = el -> el.getO().getValue().toString();
                                   break;

                           }
                           val keyExtractorFinal = keyExtractor;
                           results.forEach((el) -> result.add(new KeyValue<>(new Windowed(new SJSONtKey(keyExtractorFinal.apply(el)), k.window()), t1_object)));
                           return result;
                       })
                       .groupByKey(Grouped.with(executor.windowedSerde(), executor.valueSpecificAvroSerde()))
                       .aggregate(() -> new SJSONTripleMap(new HashMap<>()),
                               SJSONTripleStream.aggregatorPostRekey
                       );
           this.table(left.join(right, SJSONTripleStream.SJSONtripleMapsJoiner(new ArrayList<>(node.children().get(0).vars().values().stream().flatMap(el -> el.keySet().stream()).collect(Collectors.toSet())), new ArrayList<>(node.children().get(1).vars().values().stream().flatMap(el -> el.keySet().stream()).collect(Collectors.toSet())))));
       } else {
           this.table(left);
       }
    }
}
