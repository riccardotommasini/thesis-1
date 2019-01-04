package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.Duration;

@ToString()
@Accessors(fluent = true)
public class LogicalWindow extends Window {
    @Getter @Setter
    private Duration duration;
    @Getter @Setter
    private Duration step;

}
