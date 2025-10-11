package com.example.util;
import java.lang.ScopedValue;

public class ScopedValueExample {
    private static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(USER, "admin").run(() -> {
            System.out.println("현재 사용자: " + USER.get());
            Thread thread = Thread.ofVirtual().start(() -> {
                // 자식 스레드에서도 USER 값을 안전하게 공유
                System.out.println("[VirtualThread] 사용자: " + USER.get());
            });
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        try {
            System.out.println(USER.get());
        } catch (IllegalStateException e) {
            System.out.println("블록 밖에서 접근 시 오류: " + e.getMessage());
        }
    }
}