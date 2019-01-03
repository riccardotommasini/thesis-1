package phisco.streams.polimi.it.Parser;

import lombok.*;
import lombok.experimental.Accessors;
import org.jgrapht.graph.DefaultEdge;

@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JoinEdge extends DefaultEdge {
    @Getter @Setter
    private String var;

}
