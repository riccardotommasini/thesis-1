package phisco.streams.polimi.it.executor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import phisco.streams.polimi.it.Algebra.RelNode;

@ToString
@Accessors(fluent = true)
@NoArgsConstructor
public class KafkaNode {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private KStream stream;
    @Getter @Setter
    private KTable table;
    public KafkaNode(RelNode node){
        this.name = node.name();
    }
}
