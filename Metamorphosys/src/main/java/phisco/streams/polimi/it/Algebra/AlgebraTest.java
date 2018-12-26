package phisco.streams.polimi.it.Algebra;

public class AlgebraTest {

    public static void main(String[] args)
    {
       RelBuilder builder = new RelBuilder();
       builder.scan("topic", "S1")
               .filter("topic","F1")
               .filter("topic","F2")
               .filter("topic","F3")
               .window("F1","W1")
               .window("F2","W2")
               .window("F3","W3")
               .join("W1","W2", "J1")
               .join("J1","W3", "J2")
               .project("J2", "P1");
       builder.optimize()
               .build()
               .run();
    }
}
