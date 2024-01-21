package net.upat5;

import static net.upat5.lib.learning.CharExamples.example1;
import static net.upat5.lib.learning.Primitives.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        usePrimitives();
        integralMinValues();
        integralMaxValues();
        characterRange();
        floatingPointRanges();
        integralSizes();

        System.out.println("char usage");
        example1();
        exampleOverflows();
    }
}