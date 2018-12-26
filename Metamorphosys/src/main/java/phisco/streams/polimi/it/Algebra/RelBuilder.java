package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.kafka.streams.kstream.Window;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Accessors(fluent = true)
public class RelBuilder<K> {

    @Getter @Setter
    private Map<String,RelNode> forest;
    @Getter @Setter
    private String root;
    @Getter @Setter
    private List<OptimizationRule> rules;
    @Getter @Setter
    private Executor executor;

    public RelBuilder()
    {
        forest =  new HashMap<>();
        executor = new KafkaExecutor();
    }

    public RelBuilder scan(String name, String key){
        this.forest.put(name, new ScanNode(name, key));
        this.root = name;
        return this;
    }

    public RelBuilder filter(String child, String parent, Function<K,Boolean> filter){
        this.forest.put(parent,
                new FilterNode().addChildren(this.forest.get(child)));
        this.root = parent;
        return this;
    }

    public RelBuilder window(String child, String parent, Window window){
        this.forest.put(parent,
                new WindowNode().setWindow(window).addChildren(this.forest.get(child)));
        this.root = parent;
        return this;
    }

    public RelBuilder project(String child, String parent,  Function<K,K> projector){
        this.forest.put(parent,
                new ProjectNode().projector(projector).addChildren(this.forest.get(child)));
        this.root = parent;
        return this;
    }

    public RelBuilder join(String left, String right, String parent, Function<K,Boolean> joiner){
        this.forest.put(parent,
                new JoinNode().joiner(joiner).addChildren(this.forest.get(left),this.forest.get(right)));
        this.root = parent;
        return this;
    }

    public RelBuilder optimize(){
        return this;
    }

    public RelBuilder build(){
        return this;
    }

    public RelBuilder run(){
        executor.execute(forest.get("root"));
        return this;
    }

}
