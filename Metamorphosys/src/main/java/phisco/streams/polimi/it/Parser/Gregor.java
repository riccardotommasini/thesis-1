package phisco.streams.polimi.it.Parser;


import lombok.*;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.misc.Pair;
import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
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
    private Vars vars;
    private Set<String> useful_vars;
    @Getter
    private Map<String, List<String>> filterSubObj;
    @Getter
    private Graph<String, JoinEdge> joinGraph;
    public Gregor(){
        builder = new RelBuilder();
        vars = new Vars();
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
        LogicalWindow w = new LogicalWindow().duration(Duration.parse(ctx.logicalRange().DURATION().getText()));
        if (ctx.logicalStep()!=null){
            w.step(Duration.parse(ctx.logicalStep().DURATION().getText()));
        } else {
            w.step(w.duration());
        }
        return w;
    }


    @Override
    public Object visitSelectQuery(RSPQLParser.SelectQueryContext ctx) {
        ctx.datasetClause().forEach(c ->  visitDatasetClause(c));
        visitSelectClause(ctx.selectClause());
        visitWhereClause(ctx.whereClause());
        doJoinsPerCluster(clusterize());
        doJoinBetweenClusters();
        System.out.println(this.builder.forest().get(this.builder.root()).pprint(0));
        this.builder.project(this.builder.root(),"P"+i++,this.useful_vars);
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
                    filters.put(S, s -> s.equals(term));
                    this.vars.merge(term, Collections.singletonMap(name, new HashSet<Key>(){{add(S);}}),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(S);}}));
                    filterSubObj.merge(name, Arrays.asList(term),
                            (oldV, newV) -> new ArrayList<String>(oldV){{
                                addAll(newV);
                    }});
                } else {
                    String term = ctx.varOrTerm().var().getText();
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(S);}}));
                    filterSubObj.merge(name, Arrays.asList(term),
                            (oldV, newV) -> new ArrayList<String>(oldV) {{
                                    addAll(newV);
                                }});
                }
                if (p.verb().TYPE() != null || p.verb().varOrIri().iri() != null) {
                    filters.put(P, v -> v.equals(p.verb().getText()));
                }
                else
                    vars.put(p.verb().varOrIri().var().getText(), Collections.singletonMap(name, new HashSet<Key>(){{add(P);}}));
                if (o.varOrTerm().graphTerm() != null)  // not handling blankNodePropertyList atm
                {
                    String term = o.varOrTerm().graphTerm().getText();
                    filters.put(O, v -> v.equals(term));
                    this.vars.merge(term, Collections.singletonMap(name, new HashSet<Key>(){{add(O);}}),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(O);}}));
                    filterSubObj.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                else {
                    String term = o.varOrTerm().var().getText();
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(O);}}));
                    filterSubObj.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                builder.addNode(name,
                        new FilterNode()
                                .filters(filters)
                                .addChildren((RelNode) this.builder.forest().get(this.last_source))
                                .scanKeys(new ScanKeys(){{put(name, builder.forest().get(last_source).scanKeys().get(last_source));}})
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

    private Map<String,Pair<Set<String>,List<String>>> clusterize(){
        filterSubObj.keySet().forEach(f -> joinGraph.addVertex(f));
        vars.entrySet()
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
            if (cluster.size() > 1)
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
                                .sorted(Comparator.comparingInt(this::scoreVar).reversed())
                                .collect(Collectors.toList())))
                .collect(Collectors.toMap(el -> "C"+i++, Function.identity()));
        return joinClustersVars;
    }

    private int scoreVar(String var){
        return this.vars.get(var).entrySet().stream()
                .flatMap(e -> e.getValue().stream()
                        .map(v ->
                                e.getValue().contains(this.builder.forest().get(e.getKey()).scanKeys().get(e.getKey())) ?
                                1 : 0)).mapToInt(i -> i).sum();
    }


    private void doJoinsPerCluster(Map<String,Pair<Set<String>,List<String>>> clusters){
        clusters.forEach((key,val) -> {
            Set usedFilters = new HashSet();
            if (val.a.size() > 1){
                var vb = val.b;
                String left = "";
                for (String v: vb){
                    List<String> filters = new ArrayList(vars.get(v).keySet()){{removeAll(usedFilters);}};
                    int j = 0;
                    if (left.equals("")) {
                        left = filters.get(0);
                        usedFilters.add(left);
                        j++;
                    }
                    for ( ; j<filters.size(); j++){
                        String join = "J"+i++;
                        String right = filters.get(j);
                        usedFilters.add(right);
                        this.builder.join(left, right, join, new HashSet<String>(){{add(v);}}, JoinType.NATURAL);
                        left = join;
                    }
                }
            }
        });
    }

    private void doJoinBetweenClusters(){
        List<String> rootsToJoin = this.builder.roots().stream()
                .filter(r -> this.builder.forest().get(r) instanceof JoinNode || this.builder.forest().get(r) instanceof FilterNode)
                .collect(Collectors.toList());
        String left = rootsToJoin.get(0);
        for (int j=1; j<rootsToJoin.size(); j++){
            String join = "J"+i++;
            this.builder.join(left, rootsToJoin.get(j), join, new HashSet<>(), JoinType.BLOCKING);
            left = join;
        }
        this.builder.roots(new ArrayList<String>(){{add(builder.root());}});
    }

     public void run(){
        this.builder.run();
     }

     public void optimize( List<OptimizationRule> rules){
        this.builder.forest().get(this.builder.root()).walk(rules, this.builder);
        update();
     }
     public void update(){
         this.builder.update();
     }
}
