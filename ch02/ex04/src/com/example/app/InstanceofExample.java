package com.example.app;

public class InstanceofExample {
    public static void main(String[] args) {
        Object obj = "hello";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }

        // Java 16+ 패턴 매칭
        if (obj instanceof String str) {
            System.out.println(str.length());
        }
    }
}