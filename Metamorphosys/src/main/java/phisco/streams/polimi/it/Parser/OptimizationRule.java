package phisco.streams.polimi.it.Parser;

import phisco.streams.polimi.it.Algebra.RelNode;

import java.util.List;
import java.util.function.Function;

public abstract class OptimizationRule implements Function<RelNode, List<RelNode>> {
    public abstract boolean isApplicable(RelNode node);
}
