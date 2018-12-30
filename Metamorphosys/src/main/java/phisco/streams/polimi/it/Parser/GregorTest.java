package phisco.streams.polimi.it.Parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import phisco.streams.polimi.it.antlr4.RSPQLLexer;
import phisco.streams.polimi.it.antlr4.RSPQLParser;

public class GregorTest {
    public static void main( String[] args ){
        CharStream input = new ANTLRInputStream("SELECT ?s ?p ?o FROM NAMED WINDOW :window ON :stream [ RANGE PT1H ] FROM NAMED WINDOW :window2 ON :stream2 [ RANGE PT1H ] WHERE { WINDOW :window {?s1 :p1 ?o1; :p2 ?o2, ?o3; ?o3 :p2 :o3 } WINDOW :window2 {?s1 :p3 :o3 } } ;");
        RSPQLLexer lexer = new RSPQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RSPQLParser parser = new RSPQLParser(tokens);
        //System.out.println(parser.queryUnit().toStringTree(parser));
        Gregor gregor = new Gregor();
        gregor.visit(parser.queryUnit());
        //System.out.println(gregor.builder().forest().get(gregor.builder().root()));
        System.out.println(gregor.vars());
        System.out.println(gregor.builder().score(gregor.vars()));


    }
}
