package com.example.util;

public class ScopedHandleRequest {
    static final ScopedValue<String> REQUEST_ID = ScopedValue.newInstance();
    public static void main(String[] args) {
        void handleRequest(String id) {
            ScopedValue.where(REQUEST_ID, id).run(() -> {
                System.out.println("Handling request: " + REQUEST_ID.get());
            });
        }
    }
}