package com.example.app;

public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println("a+b=" + (a + b)); // 10
        System.out.println("a/b=" + (a / b)); // 2 (정수 나눗셈)
        System.out.println("a/(double)b=" + (a / (double)b)); // 2.333...
        System.out.println("a%b=" + (a % b)); // 1

        int x = 5;
        System.out.println("++x = " + (++x)); // 전위: 먼저 증가 -> 6 출력
        x = 5;
        System.out.println("x++ = " + (x++)); // 후위: 먼저 사용 -> 5 출력, 이후 x=6
    }
}