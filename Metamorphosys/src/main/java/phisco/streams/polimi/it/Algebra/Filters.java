package phisco.streams.polimi.it.Algebra;

import lombok.ToString;

import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;

@ToString(callSuper = true)
public class Filters extends HashMap<Key, Predicate> {
}
