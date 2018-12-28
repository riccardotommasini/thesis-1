package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import lombok.ToString;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class FilterNode extends RelNode{
    @Getter @Setter
    private Map<Key,String> filter;


    public FilterNode() {
        super();
        this.filter = new HashMap<>();
    }
}
