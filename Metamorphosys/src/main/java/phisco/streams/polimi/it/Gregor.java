package phisco.streams.polimi.it;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import phisco.streams.polimi.it.antlr4.RSPQLBaseVisitor;
import phisco.streams.polimi.it.antlr4.RSPQLLexer;
import phisco.streams.polimi.it.antlr4.RSPQLParser;
import phisco.streams.polimi.it.antlr4.RSPQLVisitor;

import java.util.stream.Collectors;

public class Gregor {

    public static void main( String[] args ){
        CharStream input = new ANTLRInputStream("SELECT ?s ?pp ?oo WHERE { ?s1 ?p1 ?o1, ?o3; ?p2 ?o2 } ;");
        RSPQLLexer lexer = new RSPQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RSPQLParser parser = new RSPQLParser(tokens);
        //System.out.println(parser.queryUnit().toStringTree(parser));
        RSPQLVisitor visitor = new RSPQLBaseVisitor() {
            @Override
            public Object visitSelectQuery(RSPQLParser.SelectQueryContext ctx) {
                System.out.println(ctx.selectClause().resultVar().stream().map(el -> el.var().varname().getText()).collect(Collectors.toList()));
                return visitChildren(ctx);
            }
        };
        visitor.visit(parser.queryUnit());
    }
}
