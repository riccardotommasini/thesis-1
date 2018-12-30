package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.misc.Pair;

import java.util.*;
import java.util.stream.Collectors;

import static phisco.streams.polimi.it.Algebra.JoinType.NATURAL;

@ToString
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
        RelNode node = new ScanNode().name(name).addScanKeys(key);
        updateState(node);
        return this;
    }

    public RelBuilder filter(String child, String parent, Filters filter, Vars vars){
        RelNode node = new FilterNode()
                .filters(filter)
                .addChildren(this.forest.get(child))
                .name(parent)
                .vars(vars)
                .scanKeys(this.forest.get(child).scanKeys());
        updateState(node);
        return this;
    }

    public RelBuilder window(String child, String parent, Window window){
        RelNode w = new WindowNode()
                .window(window)
                .name(parent)
                .addChildren(this.forest.get(child))
                .scanKeys(this.forest.get(child).scanKeys());
        if (forest.get(child).vars() != null)
            w.vars(forest.get(child).vars());
        updateState(w);
        return this;
    }

    public RelBuilder project(String child, String parent, Vars vars){
        RelNode node = new ProjectNode()
                .addChildren(this.forest.get(child))
                .name(parent)
                .vars(vars);
        updateState(node);
        return this;
    }

    public RelBuilder join(String left, String right, String parent, Vars keys){
        RelNode node = new JoinNode()
                .keys(keys)
                .joinType(NATURAL)
                .name(parent)
                .addChildren(this.forest.get(left),this.forest.get(right))
                .vars(forest.get(left).vars().merge(forest.get(right).vars()))
                .scanKeys(this.forest.get(left).scanKeys())
                .addScanKeys(this.forest.get(right).scanKeys());
        updateState(node);
        return this;
    }

    public RelBuilder addNode(String name, RelNode node){
        node.name(name);
        node.children().forEach(c -> node.addScanKeys(c.scanKeys()));
        updateState(node);
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


    private void updateState(RelNode node){
        this.forest.put(node.name(), node);
        this.previous_root = this.root;
        this.root = node.name();
        //if (node.children() != null)
        //    this.roots.removeAll(node.children().stream().map(c -> c.name()).collect(Collectors.toList()));
    }
}
