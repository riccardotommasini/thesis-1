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


    }
