package net.upat5.lib.learning;

public class SwitchExamples {
    public static void main(String[] args) {
        var x = 5;
        switchMethod(x++);
        switchMethod(x++);
        switchMethod(1);
        System.out.println(assignment(1));
        System.out.println(assignment(2));
    }

    private static void switchMethod(int x) {
        // Hint: use braces if you need more than one statement
        switch(x) {
            case 1, 3 -> System.out.println("You gave me a 1 or a 3.");
            case 4    -> System.out.println("You gave me a 4.");
            default   -> System.out.println(("Not a 1, 3, or 4"));
        }
    }

    private static boolean assignment(int x) {
        return switch(x) {
            case 1, 3, 5 -> {
                System.out.println("You gave me a 1, 3, or 5");
                yield false;
            }
            default -> true;
        };
    }
}
