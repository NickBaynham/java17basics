package net.upat5.lib.learning;

public abstract class CharExamples {
    public static void example1() {
        char x1 = '\u0032';
        System.out.println("Character: '" + x1 + "'");
        x1 = '2';
        System.out.println("Character: '" + x1 + "'");
        char x2 = 65;
        System.out.println("Character: '" + x2 + "'");
        x2 = '\u0041';
        System.out.println("Character: '" + x2 + "'");
        x2 = 'A';
        System.out.println("Character: '" + x2 + "'");
        System.out.println("Sum of x1 and x2 is: '" + (x1 + x2) + "'");
        System.out.println("Numeric value of ' is: " + (int) '\'');
        System.out.println("Character: \u2035" + x2 + "\u2035");
    }
}
