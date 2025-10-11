package com.example.app;
import java.util.concurrent.*;

public class ExecutorShutdownExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 6; i++) {
            final int id = i;
            exec.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " task " + id);
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            });
        }
        exec.shutdown(); // 더 이상 작업 수락 안함
        if (!exec.awaitTermination(5, TimeUnit.SECONDS)) {
            exec.shutdownNow(); // 강제 종료 요청
        }
        System.out.println("All tasks finished");
    }
}