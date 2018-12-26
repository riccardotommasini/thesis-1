package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Function;

@Accessors(fluent = true)
public class JoinNode extends RelNode{

    @Getter @Setter
    private Function joiner;

}
