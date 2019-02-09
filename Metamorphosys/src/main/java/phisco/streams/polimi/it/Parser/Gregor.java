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

@SuppressWarnings("Duplicates")
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
        doJoins();
        System.out.println(this.builder.forest().get(this.builder.root()).pprint(0));
        String name = "P" + i++;
        this.builder.project(this.builder.root(), name, this.useful_vars);
        this.builder.forest().get(name).update();
        return null;
    }

    @Override
    public Object visitWindowGraphPattern(RSPQLParser.WindowGraphPatternContext ctx) {
        last_source = visitVarOrIri(ctx.varOrIri());
        return super.visitWindowGraphPattern(ctx);
    }

    @Override
    public Object visitWhereClause(RSPQLParser.WhereClauseContext ctx) {
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
                    String term = visitGraphTerm(ctx.varOrTerm().graphTerm()).replaceAll("(^<|>$)","");
                    filters.put(S, s -> s.equals(term));
                    this.vars.merge(term, Collections.singletonMap(name, new HashSet<Key>(){{add(S);}}),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(S);}}));
                    filterSubObj.merge(name, Arrays.asList(term),
                            (oldV, newV) -> new ArrayList<String>(oldV){{
                                addAll(newV);
                    }});
                } else {
                    String term = ctx.varOrTerm().var().getText().replaceAll("(^<|>$)","");
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(S);}}));
                    filterSubObj.merge(name, Arrays.asList(term),
                            (oldV, newV) -> new ArrayList<String>(oldV) {{
                                    addAll(newV);
                                }});
                }
                if (p.verb().TYPE() != null || p.verb().varOrIri().iri() != null) {
                    filters.put(P, v -> v.equals(p.verb().getText().replaceAll("(^<|>$)","")));
                }
                else
                    vars.put(p.verb().varOrIri().var().getText().replaceAll("(^<|>$)",""),
                            Collections.singletonMap(name, new HashSet<Key>(){{add(P);}}));
                if (o.varOrTerm().graphTerm() != null)  // not handling blankNodePropertyList atm
                {
                    String term = o.varOrTerm().graphTerm().getText().replaceAll("(^<|>$)","");
                    filters.put(O, v -> v.equals(term));
                    this.vars.merge(term, Collections.singletonMap(name, new HashSet<Key>(){{add(O);}}),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(O);}}));
                    filterSubObj.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                else {
                    String term = o.varOrTerm().var().getText().replaceAll("(^<|>$)","");
                    vars.put(term, Collections.singletonMap(name, new HashSet<Key>(){{add(O);}}));
                    filterSubObj.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                builder.addNode(name,
                        new FilterNode()
                                .filters(filters)
                                .addChildren((RelNode) this.builder.forest().get(this.last_source))
                                .scanKeys(new ScanKeys(){{put(name,
                                        builder.forest().get(last_source).scanKeys().get(last_source));}})
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

    private void populateJoinGraph(){
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
    }

    private void doJoins(){
        populateJoinGraph();
        System.out.println(joinGraph);
        int numberOfClusters = new ConnectivityInspector<>(joinGraph).connectedSets().size();
        while (joinGraph.vertexSet().size() > numberOfClusters){
            var sorted_edges = sortedEdges(joinGraph);
            System.out.println(sorted_edges);
            String source = joinGraph.getEdgeSource(sorted_edges.get(0));
            String target = joinGraph.getEdgeTarget(sorted_edges.get(0));
            Set<JoinEdge> joinEdges = joinGraph.getAllEdges(source,target);
            Set<String> joinVars = joinEdges.stream().map(e -> e.var()).collect(Collectors.toSet());
            String parent = "J" + i++;
            this.builder.join(source,target,parent, joinVars, JoinType.NATURAL);
            this.joinGraph.removeAllEdges(joinEdges);
            joinGraph.addVertex(parent);
            Arrays.asList(source,target).forEach( v -> {
                        var outgoing = new ArrayList<>(joinGraph.outgoingEdgesOf(v));
                        var incoming = new ArrayList<>(joinGraph.incomingEdgesOf(v));
                        for (var out : outgoing) {
                            joinGraph.addEdge(parent, joinGraph.getEdgeTarget(out), new JoinEdge(out.var()));
                            System.out.println("out add " + parent +
                                    " -> " + joinGraph.getEdgeTarget(out) + " ( " + sorted_edges.get(0).var() + " )");
                        }
                        for (var in : incoming) {
                            joinGraph.addEdge(joinGraph.getEdgeSource(in), parent, new JoinEdge(in.var()));
                            System.out.println("in add " + parent + " <- " +
                                    joinGraph.getEdgeSource(in) + " ( " + sorted_edges.get(0).var() + " )");
                        }
                    }
            );
            joinGraph.removeVertex(source);
            joinGraph.removeVertex(target);
            System.out.println(source + " + " + target + " -> " + parent + " = " + joinGraph);
            System.out.println(joinGraph);
        }
        if (joinGraph.vertexSet().size() > 1){
            List<String> vertices = new ArrayList(joinGraph.vertexSet());
            String prev = vertices.get(0);
            for (int j=1; j < vertices.size(); j++){
                String parent = "J" + i++;
                this.builder.join(prev, vertices.get(j), parent, new HashSet<>(), JoinType.BLOCKING);
            }
        }
    }

    private List<JoinEdge> sortedEdges(Graph<String, JoinEdge> joinGraph){
        return joinGraph.edgeSet()
                .parallelStream()
                .sorted(Comparator.comparingInt(e -> - scoreJoinEdge(e.var(), joinGraph.getEdgeSource(e),
                        joinGraph.getEdgeTarget(e))))
                .collect(Collectors.toList());
    }

    private int scoreJoinEdge(String var, String edgeSource, String edgeTarget) {
        int score = 0;
        val source = this.builder.forest().get(edgeSource);
        val target = this.builder.forest().get(edgeTarget);
        score += scoreEdgeGivenVar(var,source);
        score += scoreEdgeGivenVar(var,target);
        System.out.println(edgeSource + " -> " + edgeTarget + " : " + score);
        return score;
    }

    private int scoreEdgeGivenVar(String var, RelNode node){
        if ( ! (node instanceof JoinNode)) {
            System.out.println(var + " -> " + node);
            return (int) (long) node.vars().get(var).entrySet()
                    .stream()
                    .filter(e -> node.scanKeys().containsKey(e.getKey()) &&
                            !e.getValue().containsAll(node.scanKeys().get(e.getKey())))
                    .count();
        }
        return 0;
    }

     public void optimize( List<OptimizationRule> rules){
        this.builder.forest().get(this.builder.root()).walk(rules, this.builder);
        update();
     }

     public void update(){
         this.builder.update();
     }
}
