package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import lombok.ToString;

import java.util.Map;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class FilterNode extends RelNode{
    @Getter @Setter @ToString.Exclude
    private Filters filters;


    public FilterNode() {
        super();
        this.filters = new Filters();
    }
}
