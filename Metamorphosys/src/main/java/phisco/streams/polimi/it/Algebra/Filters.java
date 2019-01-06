package phisco.streams.polimi.it.Algebra;

import lombok.ToString;

import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;

@ToString(callSuper = true)
public class Filters extends HashMap<Key, Predicate> {
    public org.apache.kafka.streams.kstream.Predicate getPredicate(){
        Predicate predicate = el -> true;
        for (Predicate p : this.values()){
            predicate = p.and(predicate);
        }
        final Predicate p = predicate;
        return (k, v) -> p.test(v);
    }
}
