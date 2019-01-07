package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.*;

@Accessors(fluent = true)
@ToString(callSuper = true)
public class ScanNode extends RelNode {
    @Getter @Setter
    private Key scanKey;

    @Override
    public Map<String, RelNode> update() {
        return super.update();
    }
}
