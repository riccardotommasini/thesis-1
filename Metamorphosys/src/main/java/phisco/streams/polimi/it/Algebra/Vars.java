package phisco.streams.polimi.it.Algebra;

import java.util.*;

public class Vars extends HashMap<String, Map<String, List<Key>>> {
    public Vars merge(Vars other){
        other.keySet().forEach(k -> {
            this.merge(k, other.get(k),
                    (oldV, newV) ->
                            new HashMap<String, List<Key>>(oldV)
                            {{
                                newV.forEach((k,v) ->
                                        merge(k, v, (o, n) -> new ArrayList<Key>(o){{addAll(n);
                                }}));
                            }}
                            );
        });
        return this;
    }

}
