package net.upat5.lib.learning;

public abstract class Primitives {

    // Numeric Integrals
    static byte aByte;
    static short aShort;
    static int anInt;
    static long aLong;
    static char aChar;

    public static void usePrimitives() {
        boolean fact = true;
        System.out.println("fact is " + fact);
        if (fact) {
            System.out.println("Branching when fact is true.");
        } else {
            System.out.println("Branching when fact is false.");
        }

        aByte = 42;
        aShort = 666;
        anInt = 262626;
        aLong = 999999999;
        aChar = '\u0032';  // 2
        char[] chars = { aChar, aChar, aChar };
        String combineThem = new String(chars);
        System.out.println(combineThem);

        float f = 3.14159f;     // without f the literal would be a double
        float d = 52;           // integer is ok - since it is smaller than a float
        float e = 2.612F;       // float again
        float g = (float) 2.51; // if the number is in range, you can cast it
        float bad = (float) 999999999999999999999999999999992429539999999999999999999999999999999999999988734356.3454353;
        System.out.println(bad); // no exception is thrown, but the value becomes Infinity

        long l1 = 245645L;
        long l2 = 454534535;    // it can take a double that is a smaller type

        // base
        int i = 42;
        System.out.println(Integer.toString(i, 2));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(0b101010);
        System.out.println(Integer.toString(i, 8));
        System.out.println(Integer.toOctalString(42));
        System.out.println(Integer.toHexString(42));
        System.out.println(052);
        System.out.println(Integer.toString(i, 16));
        System.out.println(0x2a);
        System.out.println("\f");


    }

    public static void floatMinValues() {
        System.out.println("The minimum float is " + Float.MIN_VALUE);
        System.out.println("The minimum double is " + Double.MIN_VALUE);
    }

    public static void floatMaxValues() {
        System.out.println("The maximum float is " + Float.MAX_VALUE);
        System.out.println("The maximum double is " + Double.MAX_VALUE);
    }

    public static void integralMinValues() {
        System.out.println("The minimum value of Byte is " + Byte.MIN_VALUE);
        System.out.println("The minimum value of Short is " + Short.MIN_VALUE);
        System.out.println("The minimum value of Integer is " + Integer.MIN_VALUE);
        System.out.println("The minimum value of Long is " + Long.MIN_VALUE);
    }

    public static void integralMaxValues() {
        System.out.println("The maximum value of Byte is " + Byte.MAX_VALUE);
        System.out.println("The maximum value of Short is " + Short.MAX_VALUE);
        System.out.println("The maximum value of Integer is " + Integer.MAX_VALUE);
        System.out.println("The maximum value of Long is " + Long.MAX_VALUE);
    }

    public static void characterRange() {
        System.out.println("The minimum value of Character is " + (int) Character.MIN_VALUE);
        System.out.println("The maximum value of Character is " + (int) Character.MAX_VALUE);
    }

    public static void floatingPointRanges() {
        System.out.println("Float range is " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double range is " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }

    public static void integralSizes() {
        System.out.println("byte: 8 bits");
        System.out.println("char: 16 bits unsigned");
        System.out.println("short: 16 bits");
        System.out.println("int: 32 bits");
        System.out.println("long: 64 bits");
    }

    public static void exampleOverflows() {
        // you do not get a run time exception for integrals - they wrap around
        byte wrapAround = (byte) (Byte.MAX_VALUE + 1);
        wrapAround++;
        System.out.println("wrap around value is " + wrapAround);

        byte tooBig = (byte) 1_234_553_243;
        System.out.println("tooBig is " + tooBig);
    }

    public static void main(String[] args) {
        floatMinValues();
        floatMaxValues();
        integralMaxValues();
    }
}
