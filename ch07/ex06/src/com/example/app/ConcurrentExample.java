package com.example.app;
import java.util.concurrent.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentExample {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        ExecutorService exec = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            exec.submit(() -> {
                int v = counter.incrementAndGet();
                map.compute("hits", (k, old) -> (old==null) ? 1 : old+1);
            });
        }
        exec.shutdown();
        exec.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("count=" + counter.get() + ", hits=" + map.get("hits"));
    }
}