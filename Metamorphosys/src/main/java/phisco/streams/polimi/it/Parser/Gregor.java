package phisco.streams.polimi.it.Parser;


import lombok.*;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.misc.Pair;
import phisco.streams.polimi.it.Algebra.*;
import phisco.streams.polimi.it.antlr4.RSPQLBaseVisitor;
import phisco.streams.polimi.it.antlr4.RSPQLParser;

import java.time.Duration;
import java.util.*;
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
    @Getter
    private Map<String, List<String>> termsPerFilter;

    public Gregor(){
        builder = new RelBuilder();
        vars = new Vars();
        terms = new Vars();
        termsPerFilter = new HashMap<>();
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
        visitWhereClause(ctx.whereClause());
        visitSelectClause(ctx.selectClause());
        return null;
    }

    @Override
    public Object visitWindowGraphPattern(RSPQLParser.WindowGraphPatternContext ctx) {
        last_source = visitVarOrIri(ctx.varOrIri());
        return super.visitWindowGraphPattern(ctx);
    }

    @Override
    public Object visitWhereClause(RSPQLParser.WhereClauseContext ctx) {
        List<String> scores =this.score();
        scores.forEach(el -> {{
        }});
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
                    termsPerFilter.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                } else
                    vars.put(ctx.varOrTerm().var().varname().getText(), Collections.singletonMap(name, Arrays.asList(S)));
                if (p.verb().TYPE() != null || p.verb().varOrIri().iri() != null) {
                    String term = p.verb().getText();
                    filters.put(name, Collections.singletonMap(P, v -> v.equals(term)));
                    terms.merge(term, Collections.singletonMap(name, Arrays.asList(P)),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    termsPerFilter.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                else
                    vars.put(p.verb().varOrIri().var().varname().getText(), Collections.singletonMap(name, Arrays.asList(P)));
                if (o.varOrTerm().graphTerm() != null)  // not handling blankNodePropertyList atm
                {
                    String term = o.varOrTerm().graphTerm().getText();
                    filters.put(name, Collections.singletonMap(O, v -> v.equals(term)));
                    terms.merge(term, Collections.singletonMap(name, Arrays.asList(O)),
                            (oldV, newV) -> new HashMap(oldV){{putAll(newV);}});
                    termsPerFilter.merge(name, Arrays.asList(term), (oldV, newV) -> new ArrayList<String>(oldV){{addAll(newV);}});
                }
                else
                    vars.put(o.varOrTerm().var().varname().getText(), Collections.singletonMap(name, Arrays.asList(O)));
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
        return null;
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

    public List<String> score(){
        Vars currentVars = new Vars(vars);
        Vars prevVars;
        do {
            prevVars = new Vars(vars);
            for (Map<String,List<Key>> srcs: prevVars.values()){
                for (Map.Entry<String,List<Key>> src : srcs.entrySet()){
                    for (String term : termsPerFilter.get(src.getKey())){
                        currentVars.put(term, terms.get(term));
                    }
                }
            }
        } while (vars.size() > prevVars.size());

        List<String> join_vars = currentVars.entrySet()
                .stream()
                .filter(e -> e.getValue().size()>1)
                .map(e -> new Pair<>(e.getKey(), e.getValue().entrySet().stream().map(e2 -> {
                    this.builder.forest().get(e2.getKey()).scanKeys().containsAll(e2.getValue());
                    return this.builder.forest().get(e2.getKey()).scanKeys().containsAll(e2.getValue()) ? 1 : 0;
                }).reduce((i, j) -> i+j).orElse(0)))
                .sorted((i,j) -> j.b - i.b)
                .map(p -> p.a)
                .collect(Collectors.toList());
        return join_vars;
    }
}
