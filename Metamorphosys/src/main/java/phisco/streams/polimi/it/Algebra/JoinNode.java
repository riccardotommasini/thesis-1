package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.ToString;

import java.util.List;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class JoinNode extends RelNode{

    @Getter @Setter
    private List<Key> leftKey, rightKey;
    @Getter @Setter
    private JoinType joinType;

}
