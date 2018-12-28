package phisco.streams.polimi.it.Algebra;

import lombok.ToString;

@ToString(callSuper = true)
public class ScanNode extends RelNode {

    private String topic;

    public ScanNode(String topic, Key key) {
        super(key);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
