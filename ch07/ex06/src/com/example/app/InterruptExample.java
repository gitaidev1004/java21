package com.example.app;
public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                // 작업 수행
                try { Thread.sleep(1000); } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // 인터럽트 상태 복원
                }
            }
            System.out.println("Thread exiting gracefully");
        });
        t.start();
        Thread.sleep(1500);
        t.interrupt(); // 스레드 종료 요청
    }
}