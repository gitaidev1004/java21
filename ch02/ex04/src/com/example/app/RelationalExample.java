package com.example.app;

public class RelationalExample {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(a < b); // true
        System.out.println(a == b); // false

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2); // false (다른 객체)
        System.out.println(s1.equals(s2)); // true (문자열 내용 비교)

        double d = Double.NaN;
        System.out.println(d == Double.NaN); // false
        System.out.println(Double.isNaN(d)); // true
    }
}