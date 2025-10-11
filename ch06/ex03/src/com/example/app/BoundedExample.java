package com.example.app;

class Calculator {
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class BoundedExample {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 20));     // 30.0
        System.out.println(Calculator.add(3.5, 2.5));   // 6.0
    }
}