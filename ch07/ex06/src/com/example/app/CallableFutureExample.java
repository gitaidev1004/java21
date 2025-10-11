package com.example.app;
import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> f = exec.submit(() -> {
            Thread.sleep(300);
            return 42;
        });
        try {
            Integer result = f.get(1, TimeUnit.SECONDS);
            System.out.println("Result: " + result);
        } catch (TimeoutException e) {
            System.out.println("Timeout");
            f.cancel(true); // 작업 취소 요청
        } catch (ExecutionException e) {
            System.out.println("Task threw: " + e.getCause());
        } finally {
            exec.shutdown();
        }
    }
}