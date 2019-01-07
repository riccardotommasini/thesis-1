package phisco.streams.polimi.it.executor;

import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.kafka.streams.kstream.Predicate;
import phisco.streams.polimi.it.Algebra.FilterNode;
import phisco.streams.polimi.it.Algebra.Filters;
import phisco.streams.polimi.it.Algebra.Key;
import phisco.streams.polimi.it.avro.SJSONTriple;
import phisco.streams.polimi.it.avro.SJSONtKey;

import java.util.Map;

@Accessors(fluent = true)
@ToString
public class KafkaFilterNode extends KafkaNode {
    public KafkaFilterNode(KafkaExecutor executor, FilterNode node) {
        KafkaNode child = executor.nodes().get(node.children().get(0).name());
        if (child.stream() != null)
            this.stream(child.stream().filter(getStreamingPredicate(node.filters())));
        else
            this.table(); // ...
    }

    private Predicate<SJSONtKey, SJSONTriple> getStreamingPredicate(Filters filters){
        Predicate<SJSONtKey,SJSONTriple> p = (k,v) -> true;
        for  (Map.Entry<Key, java.util.function.Predicate> e : filters.entrySet()) {
            final Predicate pf = p;
            switch (e.getKey()) {
                case S:
                    p = (k, v) -> pf.test(k, v) && e.getValue().test(v.getS());
                    break;
                case P:
                    p = (k, v) -> pf.test(k, v) && e.getValue().test(v.getP());
                    break;
                case O:
                    p = (k, v) -> pf.test(k, v) && e.getValue().test(v.getO().toString());
            }
        }
        return p;
    }
}