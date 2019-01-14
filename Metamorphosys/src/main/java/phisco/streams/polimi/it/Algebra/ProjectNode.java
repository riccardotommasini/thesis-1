package phisco.streams.polimi.it.Algebra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


@Accessors(fluent = true)
@ToString(callSuper = true)
public class ProjectNode extends RelNode{
    @Getter
    public Set<String> projectVars;
    public ProjectNode(){
        super();
        projectVars = new HashSet<>();
    }

    @Override
    public Map<String, RelNode> update() {
        Map res = super.update();
        this.vars(this.children().get(0).vars());
        this.projectVars(this.projectVars());
        return res;
    }

    public RelNode projectVars(Set<String> projectVars) {
        this.projectVars = projectVars;
        this.children().forEach(c -> c.filterVars(projectVars));
        return this;
    }
}
