package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;


@Accessors(fluent = true)
@ToString
public class ProjectNode extends RelNode{
    @Getter
    public Set<String> projectVars;
    public ProjectNode(){
        super();
        projectVars = new HashSet<>();
    }

    public RelNode projectVars(Set<String> projectVars) {
        this.children().forEach(c -> c.filterVars(projectVars));
        return this;
    }
}
