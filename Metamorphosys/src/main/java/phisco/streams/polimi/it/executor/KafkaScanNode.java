package phisco.streams.polimi.it.executor;

import lombok.*;
import lombok.experimental.Accessors;
import phisco.streams.polimi.it.Algebra.ScanNode;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class KafkaScanNode extends KafkaNode {

    public KafkaScanNode(KafkaExecutor executor, ScanNode node){
        super(node);
        this.stream(executor.builder().stream(node.name()));
    }
}
