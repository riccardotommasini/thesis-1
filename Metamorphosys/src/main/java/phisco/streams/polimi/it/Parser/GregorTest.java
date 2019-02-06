package phisco.streams.polimi.it.Parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import phisco.streams.polimi.it.Algebra.PushFiltersBeforeWindows;
import phisco.streams.polimi.it.executor.Executor;
import phisco.streams.polimi.it.executor.KafkaExecutor;
import phisco.streams.polimi.it.antlr4.RSPQLLexer;
import phisco.streams.polimi.it.antlr4.RSPQLParser;

import java.sql.Timestamp;
import java.util.Arrays;

public class GregorTest {
    public static void main( String[] args ){
        CharStream input = new ANTLRInputStream(
                        "        SELECT ?sensor ?value ?uom ?result\n" +
                        "        FROM NAMED WINDOW :win ON observations [RANGE PT1H]\n" +
                        "        WHERE {\n" +
                        "            WINDOW :win {\n" +
                        "                ?observation <http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#procedure> ?sensor ;\n" +
                        "                    <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://knoesis.wright.edu/ssw/ont/weather.owl#RainfallObservation> ;\n" +
                        "                    <http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#result> ?result .\n" +
                        "                ?result <http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#floatValue> ?value .\n" +
                                "                <http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#uom> ?uom . \n"+
                        "            }\n" +
                        "         };");
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
        System.out.println(gregor.builder().forest().get(gregor.builder().root()).pprint(0));
        gregor.optimize(Arrays.asList(new PushFiltersBeforeWindows()));
        System.out.println("optimized: "+ gregor.builder().forest().get(gregor.builder().root()).pprint(0));

        Executor executor = new KafkaExecutor("executor-" + new Timestamp(System.currentTimeMillis()).getTime());
        System.out.println(executor.walk(gregor.builder().forest().get(gregor.builder().root())));
        executor.execute();
    }
}
