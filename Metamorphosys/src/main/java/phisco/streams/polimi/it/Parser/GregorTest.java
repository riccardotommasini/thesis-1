package phisco.streams.polimi.it.Parser;

import lombok.var;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import phisco.streams.polimi.it.antlr4.RSPQLLexer;
import phisco.streams.polimi.it.antlr4.RSPQLParser;

public class GregorTest {
    public static void main( String[] args ){
        CharStream input = new ANTLRInputStream(
                "SELECT DISTINCT ?s ?o " +
                        "FROM NAMED WINDOW :window ON :stream [ RANGE PT1H ] " +
                        "FROM NAMED WINDOW :window2 ON :stream2 [ RANGE PT1H ] " +
                        "WHERE { " +
                        "WINDOW :window { " +
                            "?s :p1 :o1; " +
                            "   :p2 ?o . " +
                            "?o :p3 :o3 ." +
                            ":o3 :p3 :o4 ;" +
                            "    :p4 :o5." +
                        "} " +
                        "};");
        RSPQLLexer lexer = new RSPQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RSPQLParser parser = new RSPQLParser(tokens);
        //System.out.println(parser.queryUnit().toStringTree(parser));
        Gregor gregor = new Gregor();
        gregor.visit(parser.queryUnit());
        System.out.println("vars: " + gregor.vars());
        System.out.println("filterSubObj: " + gregor.filterSubObj());
        //System.out.println("scored: " + gregor.score());
        System.out.println("joinGraph: " + gregor.joinGraph());
        System.out.println("roots: " + gregor.builder().roots());
        gregor.builder().roots().forEach(r -> System.out.println(r + " : " + gregor.builder().forest().get(r).pprint(0)));
        gregor.builder().forest().get(gregor.builder().root()).pprint(0);
    }
}
