package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.ToString;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class WindowNode extends RelNode{

    @Getter @Setter
    private Window window;

}
