package com.example.app;

import java.util.concurrent.*;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore dbSem = new Semaphore(10); // 동시 10개 작업 허용

        // Virtual Thread Executor 생성
        ExecutorService exec = Executors.newVirtualThreadPerTaskExecutor();

        try {
            for (int i = 1; i <= 20; i++) { // 20개의 작업 제출
                int taskId = i;
                exec.submit(() -> {
                    try {
                        dbSem.acquire(); // 세마포어 획득
                        System.out.println("작업 " + taskId + " 시작 (Thread: " + Thread.currentThread() + ")");
                        Thread.sleep(500); // DB 작업 시뮬레이션
                        System.out.println("작업 " + taskId + " 완료");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        dbSem.release(); // 세마포어 반환
                    }
                });
            }
        } finally {
            exec.shutdown(); // 더 이상 작업 제출하지 않음
            try {
                // 모든 작업이 끝날 때까지 대기
                if (!exec.awaitTermination(5, TimeUnit.SECONDS)) {
                    exec.shutdownNow();
                }
            } catch (InterruptedException e) {
                exec.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("모든 작업 완료");
    }
}