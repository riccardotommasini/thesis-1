package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.ToString;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class JoinNode extends RelNode{

    @Getter @Setter
    private Vars keys;
    @Getter @Setter
    private JoinType joinType;

}
