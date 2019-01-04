package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

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
}
