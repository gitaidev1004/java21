package com.example.app;

class Outer {
    private static String staticMsg = "Static Message";
    static class StaticInner {
        void print() {
            System.out.println("Accessing: " + staticMsg);
        }
    }
}

public class NestedExample {
    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.print();
    }
}