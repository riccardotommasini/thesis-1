package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.commons.lang.RandomStringUtils;
import phisco.streams.polimi.it.executor.Executor;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Accessors(fluent = true)
public abstract class RelNode {

    @Getter @Setter
    private List<RelNode> children;
    @Getter @Setter
    private ScanKeys scanKeys;
    @Getter @Setter
    private Vars keys;
    @Getter @Setter
    private Vars vars;
    @Getter @Setter
    private String name;


    public RelNode() {
        this.children = new ArrayList<>();
        this.vars = new Vars();
        this.scanKeys = new ScanKeys();
    }

    public RelNode addChildren( RelNode... children){
        this.children.addAll(Arrays.asList(children));
        return this;
    }

    public void filterVars(Set<String> vars){
        this.vars.keySet().retainAll(vars);
        if (children != null)
            children.forEach(c -> c.filterVars(vars));
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", scanKeys=" + scanKeys +
                (keys != null ? ", keys=" + keys : "") +
                (vars.size() > 0 ? ", vars=" + vars : "");
    }

    public String pprint(int nesting){
        String spaces = "";
        for (int i=0; i < nesting; i++)
            spaces+="| ";
        spaces+= "+ ";
        return "\n" + spaces + this.toString().replaceAll("super=","") + String.join("", this.children.stream()
                .map(c-> c.pprint(nesting+1))
                .collect(Collectors.toList()));
    }

    public List<RelNode> walk(List<OptimizationRule> rules, RelBuilder builder){
        List<RelNode> children = this.children.stream().flatMap(c -> c.walk(rules, builder).stream()).collect(Collectors.toList());
        for (OptimizationRule r : rules){
            if (r.isApplicable(this)){
                return r.apply(this);
            }
        }
        this.children(children);
        return Arrays.asList(this);
    }

    public void clone(RelNode clone){
        clone.children(this.children())
                .scanKeys(this.scanKeys())
                .name(this.name()+"_"+ RandomStringUtils.randomAlphabetic(10))
                .vars(this.vars())
                .keys(this.keys());
    }

    public Map<String, RelNode> update(){
        Map<String, RelNode> map = this.children.stream()
                .flatMap(c -> c.update().entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1,m2) -> m1));
        map.put(this.name, this);
        return map;
    }

    public void optimizeVars(){
        this.children.forEach(c -> c.optimizeVars());
    }
}
