package com.example.app;
import java.math.BigDecimal;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        System.out.println("float 0.1f = " + f);
        System.out.println("double 0.1 = " + d);
        System.out.println("f == d ? " + (f == d)); // false
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println("0.1 + 0.2 = " + bd1.add(bd2));
    }
}