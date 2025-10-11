package com.example.app;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class VirtualThreadExample {
    public static void main(String[] args) throws Exception {
        try (ExecutorService exec = Executors.newVirtualThreadPerTaskExecutor()) {
            List<Future<String>> futures = new ArrayList<>();
            for (int i=0;i<1000;i++) {
                final int id=i;
                futures.add(exec.submit(() -> {
                    Thread.sleep(50); // 블로킹 가능
                    return "task-" + id;
                }));
            }
            for (Future<String> f : futures) System.out.println(f.get());
        }
    }
}