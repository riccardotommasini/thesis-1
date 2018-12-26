package phisco.streams.polimi.it.Algebra;

import org.apache.kafka.streams.kstream.Window;

public class WindowNode extends RelNode{
    private Window window;

    public Window getWindow() {
        return window;
    }

    public WindowNode setWindow(Window window) {
        this.window = window;
        return this;
    }
}
