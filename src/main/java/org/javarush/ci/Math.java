package org.javarush.ci;

public class Math {
    public int sumPositive(int a, int b) {
        if (a < 0) {
            throw new RuntimeException("a must be greater than zero");
        }
        if (b < 0) {
            throw new RuntimeException("b must be greater than zero");
        }
        if ((long) a + (long) b > Integer.MAX_VALUE) {
            throw new RuntimeException("overflow");
        }
        return a + b;


    }
}
