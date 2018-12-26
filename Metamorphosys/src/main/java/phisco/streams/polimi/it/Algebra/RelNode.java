package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Accessors(fluent = true)
public abstract class RelNode {

    @Getter @Setter
    private List<RelNode> children;
    @Getter @Setter
    private String key;
    @Getter @Setter
    private List<String> data;


    public RelNode() {
        this.children = new ArrayList<>();
        this.data = new ArrayList<>();
    }

    public RelNode(String key) {
        super();
        this.key = key;
    }

    public RelNode addChildren( RelNode... children){
        this.children.addAll(Arrays.asList(children));
        this.key = children[0].key;
        return this;
    }

}
