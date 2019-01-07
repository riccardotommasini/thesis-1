package phisco.streams.polimi.it.Algebra;

import java.util.List;
import java.util.function.Function;

public abstract class OptimizationRule implements Function<RelNode, List<RelNode>> {
    public abstract boolean isApplicable(RelNode node);
}
