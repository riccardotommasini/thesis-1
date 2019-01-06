package phisco.streams.polimi.it.executor;

import phisco.streams.polimi.it.Algebra.RelNode;

public abstract class Executor {

    public abstract Object walk(RelNode root);
}
