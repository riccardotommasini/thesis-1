package phisco.streams.polimi.it.Algebra;

import java.util.*;

public class    Vars extends HashMap<String, Map<String, HashSet<Key>>> {
    public Vars merge(Vars other){
        other.keySet().forEach(k -> {
            this.merge(k, other.get(k),
                    (oldV, newV) ->
                            new HashMap<String, HashSet<Key>>(oldV)
                            {{
                                newV.forEach((k,v) ->
                                        merge(k, v, (o, n) -> new HashSet<Key>(o){{addAll(n);
                                }}));
                            }}
                            );
        });
        return this;
    }

    public Vars newMerged(Vars other){
        return new Vars(this).merge(other);
    }

    public Vars(){
        super();
    }
    public Vars(Vars vars){
        super(vars);
    }

}
