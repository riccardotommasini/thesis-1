package phisco.streams.polimi.it.Parser;

import lombok.var;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import phisco.streams.polimi.it.antlr4.RSPQLLexer;
import phisco.streams.polimi.it.antlr4.RSPQLParser;

import java.util.HashSet;
import java.util.Map;

public class GregorTest {
    public static void main( String[] args ){
        CharStream input = new ANTLRInputStream(
                "SELECT DISTINCT ?s ?o ?o5 " +
                        "FROM NAMED WINDOW :window ON :stream [ RANGE PT1H ] " +
                        "FROM NAMED WINDOW :window2 ON :stream2 [ RANGE PT1H ] " +
                        "WHERE { " +
                        "WINDOW :window { " +
                            "?s :p1 :o1; " +
                            "   :p2 ?o . " +
                            "?o :p3 :o3 ." +
                        "} " +
                        "WINDOW :window2 { " +
                            ":s4 :p4 :o4 ; " +
                            "    :p5 ?o5 ." +
                            "?o5 :p6 :o6 ." +
                            ":s7 :p7 :o7 ." +
                        "} " +
                        "};");
        RSPQLLexer lexer = new RSPQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RSPQLParser parser = new RSPQLParser(tokens);
        //System.out.println(parser.queryUnit().toStringTree(parser));
        Gregor gregor = new Gregor();
        gregor.visit(parser.queryUnit());
        //System.out.println(gregor.builder().forest().get(gregor.builder().root()));
        System.out.println("vars: " + gregor.vars());
        System.out.println("terms: " + gregor.terms());
        System.out.println("filterSubObj: " + gregor.filterSubObj());
        //System.out.println("scored: " + gregor.score());
        var clusters = gregor.clusterize();
        System.out.println("joinGraph: " + clusters);
        System.out.println("usefulClusters: " + gregor.usefulClusters(clusters));
        System.out.println("notUsefulClusters:" + gregor.blockingClusters(clusters));


    }
}
