package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import phisco.streams.polimi.it.executor.Executor;

import java.util.*;
import java.util.stream.Collectors;

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
    private List<String> roots;
    @Getter @Setter
    private List<OptimizationRule> rules;
    @Getter @Setter
    private Executor executor;

    public RelBuilder()
    {
        forest =  new HashMap<>();
        roots = new LinkedList<>();
    }

    public RelBuilder scan(String name, Key sk){
        RelNode node = new ScanNode().scanKey(sk).name(name).scanKeys(new ScanKeys(){{put(name,sk);}});
        updateState(node);
        return this;
    }

    public RelBuilder filter(String child, String parent, Filters filter, Vars vars){
        RelNode node = new FilterNode()
                .filters(filter)
                .addChildren(this.forest.get(child))
                .name(parent)
                .vars(vars)
                .scanKeys(new ScanKeys(){{put(parent, forest.get(child).scanKeys().get(child));}});
        updateState(node);
        return this;
    }

    public RelBuilder window(String child, String parent, Window window){
        RelNode w = new WindowNode()
                .window(window)
                .name(parent)
                .addChildren(this.forest.get(child))
                .scanKeys(new ScanKeys(){{put(parent, forest.get(child).scanKeys().get(child));}});
        if (forest.get(child).vars() != null)
            w.vars(forest.get(child).vars());
        updateState(w);
        return this;
    }

    public RelBuilder project(String child, String parent, Set<String> vars){
        RelNode node = new ProjectNode()
                .projectVars(vars)
                .addChildren(this.forest.get(child))
                .name(parent);
        updateState(node);
        node.filterVars(vars);
        return this;
    }

    public RelBuilder join(String left, String right, String parent, Set<String> keys, JoinType type){
        RelNode node = new JoinNode()
                .joinKeys(keys)
                .joinType(type)
                .name(parent)
                .addChildren(this.forest.get(left),this.forest.get(right))
                .vars(forest.get(left).vars().newMerged(forest.get(right).vars()))
                .scanKeys(new ScanKeys(this.forest.get(left).scanKeys()){{putAll(forest.get(right).scanKeys());}});
        updateState(node);
        return this;
    }


    public RelBuilder addNode(String name, RelNode node){
        node.name(name);
        //node.children().forEach(c -> node.scanKeys(c.scanKeys()));
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
        executor.walk(forest.get(this.root));
        return this;
    }


    private void updateState(RelNode node){
        this.forest.put(node.name(), node);
        this.previous_root = this.root;
        this.root = node.name();
        this.roots.add(node.name());
        if (node.children() != null)
            this.roots.removeAll(
                    node.children().stream()
                            .map(c -> c.name())
                            .collect(Collectors.toList()));
    }
}
