package com.example.app;
@FunctionalInterface
interface Calculator {
    int operate(int x, int y);
}

public class LambdaExample {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;      // 람다식
        Calculator mul = (a, b) -> a * b;      // 람다식

        System.out.println(add.operate(3, 4)); // 7
        System.out.println(mul.operate(3, 4)); // 12
    }
}