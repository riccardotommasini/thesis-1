package phisco.streams.polimi.it.executor;


import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.kafka.streams.kstream.Printed;
import phisco.streams.polimi.it.Algebra.ProjectNode;
import phisco.streams.polimi.it.Algebra.ScanNode;

@ToString(callSuper = true)
@Accessors(fluent = true)
public class KafkaProjectionNode extends KafkaNode {
    public KafkaProjectionNode(KafkaExecutor executor, ProjectNode node){
        super(node);
        executor.nodes().get(node.children().get(0).name()).table().toStream().print(Printed.toSysOut());
    }
}
