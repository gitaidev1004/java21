package com.example.util;
import java.lang.ScopedValue;

public class ScopedExample2 {
    static final ScopedValue<String> USER = ScopedValue.newInstance();
    public static void main(String[] args) {
        ScopedValue.where(USER, "guest").run(() -> {
            Thread.ofVirtual().start(() -> {
                System.out.println("Child thread user: " + USER.get());
            });
        });
    }
}