package com.example.app;

public class StringTemplateExample {
    public static void main(String[] args) {
        String name = "Java";
        int version = 21;
        String message = STR."Welcome to \{name} \{version}!";
        System.out.println(message);
    }
}