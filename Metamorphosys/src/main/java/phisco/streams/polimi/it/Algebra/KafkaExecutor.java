package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
public class KafkaExecutor extends Executor {
    @Getter @Setter
    private RelNode tree;

    public KafkaExecutor() {
    }

    @Override
    public void execute(RelNode root) {
        // switchone
    }
}
