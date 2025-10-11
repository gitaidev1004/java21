package com.example.app;

public class CastingBasic {
    public static void main(String[] args) {
        int i = 100;
        long L = i;            // 암묵적 widening: int -> long
        double d = i;          // 암묵적: int -> double

        double x = 9.78;
        int j = (int) x;       // 명시적 narrow: 소수점 절삭, j=9
        System.out.println("L=" + L + ", d=" + d + ", j=" + j);
    }
}