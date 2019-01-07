package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class JoinNode extends RelNode{

    @Getter @Setter
    private Set<String> joinKeys;
    @Getter @Setter
    private JoinType joinType;

    @Override
    public void filterVars(Set<String> vars){
        super.filterVars(new HashSet<String>(vars){{addAll(joinKeys);}});
    }

    @Override
    public Map<String, RelNode> update() {
        Map m = super.update();
        this.scanKeys(new ScanKeys(){{
            putAll(children().stream()
                .flatMap(c -> c.scanKeys().entrySet().stream())
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),(el1,el2) -> new ArrayList(new HashSet(el1){{addAll(el2);}}))));
        }});
        this.vars(new Vars(){{
            putAll(children().stream().flatMap(c -> c.vars().entrySet().stream())
                    .collect(Collectors.toMap(e -> e.getKey(),
                            e -> e.getValue(),(el1,el2) -> {el1.putAll(el2); return el1;})));
        }});
        return m;
    }
}
