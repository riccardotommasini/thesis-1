package phisco.streams.polimi.it.Algebra;

import org.apache.commons.lang.RandomStringUtils;

import java.util.*;

public class PushFiltersBeforeWindows extends OptimizationRule {
    @Override
    public boolean isApplicable(RelNode node) {
        return node instanceof FilterNode &&  node.children().get(0) instanceof WindowNode;
    }

    @Override
    public List<RelNode> apply(RelNode node) {
        //System.out.println("checking: " + node + ", children="+node.children());
        WindowNode w = (WindowNode) node.children().get(0);
        WindowNode newWindow = new WindowNode().window(w.window());
        w.clone(newWindow);
        node.children(w.children());
        Vars newVars = new Vars(node.vars());
        for (Map.Entry<String,Map<String,HashSet<Key>>> e : new ArrayList<>(newVars.entrySet())) {
            if (e.getValue().containsKey(node.name())) {
                newVars.put(e.getKey(), new HashMap<String, HashSet<Key>>(e.getValue()){{
                    put(newWindow.name(), remove(node.name()));
                }});
            } else {
                newVars.put(e.getKey(),e.getValue());
            }
        }
        newWindow.children(Arrays.asList(node)).vars(newVars)
                .scanKeys(new ScanKeys(node.scanKeys()){{put(newWindow.name(), remove(node.name()));}});
        return Arrays.asList(newWindow);
    }
}
