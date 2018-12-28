package phisco.streams.polimi.it.Algebra;

import java.util.Arrays;
import java.util.HashSet;

import static phisco.streams.polimi.it.Algebra.Key.S;

public class AlgebraTest {

    public static void main(String[] args)
    {
       RelBuilder builder = new RelBuilder();
       builder.scan("topic", S)
               //.filter("topic","F1", Arrays.asList("stocca"))
               //.filter("topic","F2", Arrays.asList("stocca") )
               //.filter("topic","F3", Arrays.asList("stocca"))
               .window("F1","W1", new LogicalWindow())
               .window("F2","W2", new LogicalWindow())
               .window("F3","W3", new LogicalWindow())
               .join("W1","W2", "J1", Arrays.asList(S), Arrays.asList(S))
               .join("J1","W3", "J2",Arrays. asList(S), Arrays.asList(S))
               .project("J2", "P1", new HashSet<>(Arrays.asList("stocca")));
       builder.optimize()
               .build()
               .run();
    }
}
