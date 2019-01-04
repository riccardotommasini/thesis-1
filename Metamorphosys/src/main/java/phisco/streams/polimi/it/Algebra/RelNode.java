package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.http.util.TextUtils;

import java.util.*;
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

    public RelNode addScanKeys(Key... sk){
        this.scanKeys.addAll(Arrays.asList(sk));
        this.children.forEach(c -> c.addScanKeys(sk));
        return this;
    }
    public RelNode addScanKeys(ScanKeys sk) {
        this.scanKeys.addAll(sk);
        this.children.forEach(c -> c.addScanKeys(sk));
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
                (scanKeys.size() > 0 ? ", scanKeys=" + scanKeys : "" ) +
                (keys != null ? ", keys=" + keys : "") +
                (vars.size() > 0 ? ", vars=" + vars : "");
    }

    public String pprint(int nesting){
        String spaces = "";
        for (int i=0; i < nesting; i++)
            spaces+="| ";
        spaces+= "+ ";
        return "\n" + spaces + this.toString() + String.join("", this.children.stream()
                .map(c-> c.pprint(nesting+1))
                .collect(Collectors.toList()));
    }
}
