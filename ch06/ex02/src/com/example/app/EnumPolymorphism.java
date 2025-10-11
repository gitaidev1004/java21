package com.example.app;

enum Operation {
    PLUS { double apply(double x, double y) { return x + y; } },
    MINUS { double apply(double x, double y) { return x - y; } },
    MULTI { double apply(double x, double y) { return x * y; } },
    DIV { double apply(double x, double y) { return x / y; } };

    abstract double apply(double x, double y);
}

public class EnumPolymorphism {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.apply(3, 5));
        System.out.println(Operation.MULTI.apply(3, 5));
    }
}