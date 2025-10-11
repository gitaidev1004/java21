package com.example.app;

import java.math.BigDecimal;

public class ParseBigDecimal {
    public static void main(String[] args) {
        String s = "123";
        int n = Integer.parseInt(s);
        System.out.println("n=" + n);

        try {
            int bad = Integer.parseInt("12a"); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("파싱 실패: " + e.getMessage());
        }

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println("bd sum = " + bd1.add(bd2)); // 0.3 정확
    }
}