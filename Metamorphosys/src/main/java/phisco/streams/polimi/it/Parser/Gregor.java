package phisco.streams.polimi.it.Parser;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.var;
import phisco.streams.polimi.it.Algebra.*;
import phisco.streams.polimi.it.antlr4.RSPQLBaseVisitor;
import phisco.streams.polimi.it.antlr4.RSPQLParser;

import java.time.Duration;
import java.util.*;

import static phisco.streams.polimi.it.Algebra.Key.*;


@Accessors(fluent = true)
public class Gregor extends RSPQLBaseVisitor {
    @Getter @Setter
    private RelBuilder builder;
    private int i;
    private String last_source;

    public Gregor(){
        builder = new RelBuilder();
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
    public Object visitGroupGraphPattern(RSPQLParser.GroupGraphPatternContext ctx) {
        return super.visitGroupGraphPattern(ctx);
    }

    @Override
    public Object visitGraphPatternSub(RSPQLParser.GraphPatternSubContext ctx) {
        return super.visitGraphPatternSub(ctx);
    }

    @Override
    public Object visitTriplesSameSubjectNoBlankNode(RSPQLParser.TriplesSameSubjectNoBlankNodeContext ctx) {
        Boolean first = true;
        for (var p : ctx.propertyListNotEmpty().property()) {
            for (var o : p.objectList().object()) {
                Set<String> vars = new HashSet<>();
                builder.addNode("F" + i++,
                        new FilterNode().filter(new HashMap<Key, String>() {{
                            if (ctx.varOrTerm().graphTerm() != null)
                                put(S, visitGraphTerm(ctx.varOrTerm().graphTerm()));
                            else
                                vars.add(ctx.varOrTerm().var().varname().getText());
                            if (p.verb().TYPE() != null || p.verb().varOrIri().iri() != null)
                                put(P, p.verb().getText());
                            else
                                vars.add(p.verb().varOrIri().var().varname().getText());
                            if (o.varOrTerm().graphTerm() != null)  // not handling blankNodePropertyList atm
                                put(O, o.varOrTerm().graphTerm().getText());
                            else
                                vars.add(o.varOrTerm().var().varname().getText());
                        }}).addChildren((RelNode) this.builder.forest().get(this.last_source))
                                .vars(vars)
                                .key(this.builder.forest().get(this.builder.root()).key()));
                if (!first)
                    builder.join(this.builder.root(), this.builder.previous_root(), "J" + i++, Arrays.asList(S), Arrays.asList(S));
                else
                    first = false;
            }
        }
        return null;
    }

    @Override
    public Object visitTriplesSameSubjectBlankNode(RSPQLParser.TriplesSameSubjectBlankNodeContext ctx) {
        Boolean first = true;
        for (var p : ctx.propertyListNotEmpty().property()) {
            for (var o : p.objectList().object()) {
                Set<String> vars = new HashSet<>();
                builder.addNode("F" + i++,
                        new FilterNode().filter(new HashMap<Key, String>() {{
                            if (p.verb().TYPE() != null || p.verb().varOrIri().iri() != null)
                                put(P, p.verb().getText());
                            else
                                vars.add(p.verb().varOrIri().var().varname().getText());
                            if (o.varOrTerm().graphTerm() != null)  // not handling blankNodePropertyList atm
                                put(O, o.varOrTerm().graphTerm().getText());
                            else
                                vars.add(o.varOrTerm().var().varname().getText());
                        }}).addChildren((RelNode) this.builder.forest().get(this.last_source)).vars(vars)
                        .key(this.builder.forest().get(this.builder.root()).key()));
                if (!first)
                    builder.join(this.builder.root(), this.builder.previous_root(), "J" + i++, Arrays.asList(S), Arrays.asList(S));
                else
                    first = false;
            }
        }
        return null;
    }

    @Override
    public Object visitObject(RSPQLParser.ObjectContext ctx) {

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
}
