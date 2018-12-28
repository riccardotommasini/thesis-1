package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.*;

import static phisco.streams.polimi.it.Algebra.JoinType.NATURAL;


@Accessors(fluent = true)
public class RelBuilder {

    @Getter @Setter
    private Map<String,RelNode> forest;
    @Getter @Setter
    private String root;
    @Getter @Setter
    private String previous_root;
    @Getter @Setter
    private List<OptimizationRule> rules;
    @Getter @Setter
    private Executor executor;

    public RelBuilder()
    {
        forest =  new HashMap<>();
    }

    public RelBuilder scan(String name, Key key){
        this.forest.put(name, new ScanNode(name, key));
        this.previous_root = this.root;
        this.root = name;
        return this;
    }

    public RelBuilder filter(String child, String parent, Map filter, Set<String> vars){
        this.forest.put(parent,
                new FilterNode()
                        .filter(filter)
                        .addChildren(this.forest.get(child))
                        .key(this.forest.get(child).key())
                        .vars(vars));
        this.previous_root = this.root;
        this.root = parent;
        return this;
    }

    public RelBuilder window(String child, String parent){
        RelNode window = new WindowNode()
                .addChildren(forest.get(child))
                .key(forest.get(child).key());
        if (forest.get(child).vars() != null)
            window.vars(forest.get(child).vars());
        this.forest.put(parent, window);

        this.previous_root = this.root;
        this.root = parent;
        return this;
    }

    public RelBuilder window(String child, String parent, Window window){
        RelNode w = new WindowNode()
                .window(window)
                .addChildren(this.forest.get(child))
                .key(this.forest.get(child).key());
        if (forest.get(child).vars() != null)
            w.vars(forest.get(child).vars());
        this.forest.put(parent, w);
        this.previous_root = this.root;
        this.root = parent;
        return this;
    }

    public RelBuilder window(String parent, LogicalWindow window){
        ((WindowNode) this.forest.get(parent)).window(window);
        this.previous_root = this.root;
        this.root = parent;
        return this;
    }

    public RelBuilder project(String child, String parent, Set<String> vars){
        this.forest.put(parent,
                new ProjectNode()
                        .addChildren(this.forest.get(child))
                        .key(this.forest.get(child).key())
                        .vars(vars));
        this.previous_root = this.root;
        this.root = parent;
        return this;
    }

    public RelBuilder join(String left, String right, String parent, List<Key> leftKey, List<Key> rightKey){
        this.forest.put(parent,
                new JoinNode()
                        .joinType(NATURAL)
                        .leftKey(leftKey)
                        .rightKey(rightKey)
                        .addChildren(this.forest.get(left),this.forest.get(right))
                        .vars(new HashSet<String>(){{
                            if (forest.get(left).vars() != null) addAll(forest.get(left).vars());
                            if (forest.get(right).vars() != null) addAll(forest.get(right).vars());
                        }}));
        this.previous_root = this.root;
        this.root = parent;
        return this;
    }

    public RelBuilder addNode(String name, RelNode node){
        this.forest.put(name, node);
        this.previous_root = this.root;
        this.root = name;
        return this;
    }
    public RelBuilder optimize(){
        return this;
    }

    public RelBuilder build(){
        return this;
    }

    public RelBuilder run(){
        executor.execute(forest.get(this.root));
        return this;
    }



}
