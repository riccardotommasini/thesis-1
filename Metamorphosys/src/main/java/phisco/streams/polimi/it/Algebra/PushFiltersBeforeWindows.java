package phisco.streams.polimi.it.Algebra;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PushFiltersBeforeWindows extends OptimizationRule {
    @Override
    public boolean isApplicable(RelNode node) {
        return node instanceof FilterNode &&  node.children().get(0) instanceof WindowNode;
    }

    @Override
    public List<RelNode> apply(RelNode node) {
        System.out.println("checking: " + node + ", children="+node.children());
        WindowNode w = (WindowNode) node.children().get(0);
        WindowNode newWindow = new WindowNode().window(w.window());
        w.clone(newWindow);
        node.children(w.children());
        newWindow.children(Arrays.asList(node)).vars(node.vars()).scanKeys(node.scanKeys());
        return Arrays.asList(newWindow);
    }
}
