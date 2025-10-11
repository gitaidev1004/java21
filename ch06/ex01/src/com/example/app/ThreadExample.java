package com.example.app;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("익명 클래스 기반 스레드 실행 중...");
            }
        });
        thread.start();
    }
}