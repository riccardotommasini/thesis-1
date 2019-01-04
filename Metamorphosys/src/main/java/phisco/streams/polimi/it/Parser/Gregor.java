package phisco.streams.polimi.it.Parser;


import lombok.*;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.misc.Pair;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.connectivity.KosarajuStrongConnectivityInspector;
import org.jgrapht.alg.interfaces.StrongConnectivityAlgorithm;
import org.jgrapht.event.GraphEdgeChangeEvent;
import org.jgrapht.graph.DefaultUndirectedGraph;
import phisco.streams.polimi.it.Algebra.*;
import phisco.streams.polimi.it.antlr4.RSPQLBaseVisitor;
import phisco.streams.polimi.it.antlr4.RSPQLParser;

import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


import static phisco.streams.polimi.it.Algebra.Key.*;

@ToString
@Accessors(fluent = true)
public class Gregor extends RSPQLBaseVisitor {
    @Getter @Setter
    private RelBuilder builder;
    private int i;
    private String last_source;
    @Getter
    private Vars vars, terms;
    private Set<String> useful_vars;
    @Getter
    private Map<String, List<String>> filterSubObj;

    private Graph<String, JoinEdge> joinGraph;

    public Gregor(){
        builder = new RelBuilder();
        vars = new Vars();
        terms = new Vars();
        filterSubObj = new HashMap<>();
        useful_vars = new HashSet<>();
        joinGraph = new DefaultUndirectedGraph<>(JoinEdge.class);
        i=0;
    }

    @Override
    public Object visitNamedWindowClause(RSPQLParser.NamedWindowClauseContext ctx) {
        String stream = ctx.streamIRI.getText();
        String window = ctx.windowIRI.getText();
        this.builder.scan(stream, S)
                .window(stream,window, visitLogicalWindow(ctx.windowDefinition().logicalWindow()));
        return null;
    }

    @Override
    public Window visitLogicalWindow(RSPQLParser.LogicalWindowContext ctx) {
        return new LogicalWindow().duration(Duration.parse(ctx.logicalRange().DURATION().getText()));
    }


    @Override
    public Object visitSelectQuery(RSPQLParser.SelectQueryContext ctx) {
        ctx.datasetClause().forEach(c ->  visitDatasetClause(c));
        visitSelectClause(ctx.selectClause());
        visitWhereClause(ctx.whereClause());
        return null;
    }

    @Override
    public Object visitWindowGraphPattern(RSPQLParser.WindowGraphPatternContext ctx) {
        last_source = visitVarOrIri(ctx.varOrIri());
        return super.visitWindowGraphPattern(ctx);
    }

    @Override
    public Object visitWhereClause(RSPQLParser.WhereClauseContext ctx) {
        //List<List<String>> scores =this.score();
        //scores.forEach(el -> {{
        //}});
        return super.visitWhereClause(ctx);
    }

    @Override
    public Object visitGroupGraphPattern(RSPQLParser.GroupGraphPatternContext ctx) {
        return super.visitGroupGraphPattern(ctx);
    }

    @Override
    public Object visitGraphPatternSub(RSPQLParser.GraphPatternSubContext ctx) {
        return super.visitGraphPatternSub(ctx);
    }

    @Override
    public Object visitTriplesSameSubjectNoBlankNode(RSPQLParser.TriplesSameSubjectNoBlankNodeContext ctx) {
        for (var p : ctx.propertyListNotEmpty().property()) {
            for (var o : p.objectList().object()) {
                Vars vars = new Vars();
                String name = "F" + i++;
                Filters filters = new Filters();
                if (ctx.varOrTerm().graphTerm() != null) {
                    String term = visitGraphTerm(ctx.varOrTerm().graphTerm());
                    filters.put(name, Collections.singletonMap(S, s -> s.equals(term)));
                    terms.merge(term, Collections.singletonMap(name, Arrays.asList(S)),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    filterSubObj.merge(name, Arrays.asList(term),
                            (oldV, newV) -> new ArrayList<String>(oldV){{
                                addAll(newV);
                    }});
                } else {
                    String term = ctx.varOrTerm().var().getText();
                    vars.put(term, Collections.singletonMap(name, Arrays.asList(S)));
                    filterSubObj.merge(name, Arrays.asList(term),
                            (oldV, newV) -> new ArrayList<String>(oldV) {{
                                    addAll(newV);
                                }});
                }
                if (p.verb().TYPE() != null || p.verb().varOrIri().iri() != null) {
                    filters.put(name, Collections.singletonMap(P, v -> v.equals(p.verb().getText())));
                }
                else
                    vars.put(p.verb().varOrIri().var().getText(), Collections.singletonMap(name, Arrays.asList(P)));
                if (o.varOrTerm().graphTerm() != null)  // not handling blankNodePropertyList atm
                {
                    String term = o.varOrTerm().graphTerm().getText();
                    filters.put(name, Collections.singletonMap(O, v -> v.equals(term)));
                    terms.merge(term, Collections.singletonMap(name, Arrays.asList(O)),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    filterSubObj.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                else {
                    String term = o.varOrTerm().var().getText();
                    vars.put(term, Collections.singletonMap(name, Arrays.asList(O)));
                    filterSubObj.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                builder.addNode(name,
                        new FilterNode()
                                .filters(filters)
                                .addChildren((RelNode) this.builder.forest().get(this.last_source))
                                .vars(vars));
                this.vars.merge(vars);
            }
        }
        return null;
    }

    @Override
    public Object visitSelectClause(RSPQLParser.SelectClauseContext ctx) {
        useful_vars.addAll(ctx.STAR() != null ? Arrays.asList("*") :
                ctx.resultVar().stream().map(r -> visitResultVar(r)).collect(Collectors.toList()));
        return null;
    }

    @Override
    public String visitResultVar(RSPQLParser.ResultVarContext ctx) {
        return ctx.var()!=null ? ctx.var().getText() : "tooooo_complicated"; //not handling "resultvar.expression"s...
    }

    @Override
    public String visitVarOrIri(RSPQLParser.VarOrIriContext ctx) {
        return ctx.iri() != null ? visitIri(ctx.iri()) : visitVar(ctx.var()) ;
    }

    @Override
    public String visitVarOrTerm(RSPQLParser.VarOrTermContext ctx) {
        return ctx.var() != null ? visitVar(ctx.var()) : visitGraphTerm(ctx.graphTerm());
    }

    @Override
    public String visitVar(RSPQLParser.VarContext ctx) {
        return ctx.varname().getText();
    }

    @Override
    public String visitGraphTerm(RSPQLParser.GraphTermContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIri(RSPQLParser.IriContext ctx) {
        return ctx.getText();
    }

    public Map<String,Pair<Set<String>,List<String>>> clusterize(){
        filterSubObj.keySet().forEach(f -> joinGraph.addVertex(f));
        vars.newMerged(terms).entrySet()
                .forEach(e -> {
                    List<String> fs = new ArrayList(e.getValue().keySet());
                    for (int i = 0; i < e.getValue().size(); i++) {
                        for (int j = i + 1; j < e.getValue().size(); j++) {
                            joinGraph.addEdge(fs.get(i), fs.get(j), new JoinEdge(e.getKey()));
                        }
                    }
                });

        List<Set<String>> connectedFilters = new ConnectivityInspector<>(joinGraph).connectedSets();

        Map<String,Pair<Set<String>,List<String>>> joinClustersVars = connectedFilters.stream().map(cluster -> {
            Pair<Set<String>,Set<String>> set = new Pair(cluster,new HashSet<>());
            List<String> clusterlist = new ArrayList<>(cluster);
            if (cluster.size() > 2)
               for (int i = 0; i < clusterlist.size(); i++){
                    for (int j = i; j < clusterlist.size(); j++){
                        JoinEdge edge = joinGraph.getEdge(clusterlist.get(i),clusterlist.get(j));
                        if (edge != null)
                            set.b.add(edge.var());
                    }
                }
            return set;})
                .map(p -> new Pair<>(p.a,
                        new ArrayList<>(p.b).stream()
                                .sorted(Comparator.comparingInt(this::scoreVar))
                                .collect(Collectors.toList())))
                .collect(Collectors.toMap(el -> "C"+i++, Function.identity()));
        return joinClustersVars;
    }

    public int scoreVar(String var){
        return 0;
    }

    public List <String> usefulClusters(Map<String,Pair<Set<String>,List<String>>> clusters){
        System.out.println("usefulVars: " + this.useful_vars);
        return clusters
                .entrySet()
                .stream()
                .filter(el -> el.getValue().b.stream().anyMatch(useful_vars::contains))
                .map(el -> el.getKey())
                .collect(Collectors.toList());
    }
    public List<Pair<Set<String>,List<String>>> blockingClusters(Map<String,Pair<Set<String>,List<String>>> clusters) {
        return new ArrayList(clusters.keySet()){{removeAll(usefulClusters(clusters));}};
    }

    public void doJoins(Map<String,Pair<Set<String>,List<String>>> clusters){
        Vars varsOrTerms = vars.newMerged(terms);
        clusters.forEach((key,val) -> {
            if (val.a.size() > 1){
                var vb = val.b;
                String left;
                for (String v: vb){
                    List<Map.Entry<String, List<Key>>> filters = new ArrayList(varsOrTerms.get(v).entrySet());
                    left = filters.get(0).getKey();
                    for (int j=1; j<filters.size(); j++){
                        String join = "J"+i++;
                        String right = filters.get(j).getKey();
                        Vars leftVars = this.builder.forest().get(left).vars();
                        Vars mergedVars = this.builder.forest().get(right).vars().newMerged(leftVars);
                        this.builder.join(left, right, join, mergedVars);
                        left = join;
                    }
                }
            }
        });
    }
}
