package net.upat5.lib.learning;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumbers {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(format.format(42_000));
        System.out.println(format.format(42_000_000));
        System.out.println(format.format(42_000_000_000L));

        NumberFormat formatPercent = NumberFormat.getPercentInstance();
        System.out.println(formatPercent.format(0.50));
    }
}
