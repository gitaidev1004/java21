package com.example.app;
public class RunnableThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                try { Thread.sleep(300); } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted");
                    return; // 안전하게 종료
                }
            }
        };

        Thread t = new Thread(task, "Worker-1");
        t.start();
        t.join(); // main 스레드는 Worker-1 종료까지 대기
        System.out.println("Main finished");
    }
}