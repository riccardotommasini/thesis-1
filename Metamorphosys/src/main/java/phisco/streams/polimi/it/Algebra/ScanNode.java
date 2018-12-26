package phisco.streams.polimi.it.Algebra;


public class ScanNode extends RelNode {

    private String topic;

    public ScanNode(String topic, String key) {
        super(key);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
