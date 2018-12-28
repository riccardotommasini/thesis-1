package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.*;

@Accessors(fluent = true)
@ToString
public abstract class RelNode {

    @Getter @Setter
    private List<RelNode> children;
    @Getter @Setter
    private Key key;
    @Getter @Setter
    private Set<String> vars;


    public RelNode() {
        this.children = new ArrayList<>();
        this.vars = new HashSet<>();
    }

    public RelNode(Key key) {
        super();
        this.key = key;
    }

    public RelNode addChildren( RelNode... children){
        this.children.addAll(Arrays.asList(children));
        return this;
    }

}
