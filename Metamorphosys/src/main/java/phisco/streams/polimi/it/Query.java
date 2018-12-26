package phisco.streams.polimi.it;

import java.util.List;

public class Query {
    List<String> select_vars;
    public Query(){

    }

    public List<String> getSelect_vars() {
        return select_vars;
    }

    public void setSelect_vars(List<String> select_vars) {
        this.select_vars = select_vars;
    }
}
