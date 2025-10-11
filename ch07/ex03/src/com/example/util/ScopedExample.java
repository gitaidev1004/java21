package com.example.util;
import java.lang.ScopedValue;

public class ScopedExample {
    static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USER, "admin").run(() -> {
            System.out.println("Current user: " + USER.get());
        });
    }
}