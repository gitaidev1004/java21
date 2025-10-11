package com.example.util;

public class ThreadLocalExample {
    private static final ThreadLocal<String> user = new ThreadLocal<String>();

    public static void main(String[] args) {
        user.set("admin");
        System.out.println(user.get());
    }
}