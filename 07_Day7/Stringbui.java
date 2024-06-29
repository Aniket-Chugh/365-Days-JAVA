package dayseven;

public class Stringbui {
    public static void main(String[] args) {
        // Declaration -->
        StringBuilder sb = new StringBuilder("Hello world!");
        System.out.println(sb);

        // example two 

        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        System.out.println(sb2);

        // example 3 --->

        StringBuilder sb3 = new StringBuilder().append("hello ").append("github");
        System.out.println(sb3);

        // example 4 ------>
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Part 1: ").append("Hello, ")
          .append("Part 2: ").append("World!")
          .append("Part 3: ").append(" How are you?");
          System.out.println(sb4);
    }

}
