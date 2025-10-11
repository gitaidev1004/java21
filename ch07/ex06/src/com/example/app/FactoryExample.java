package com.example.app;
import java.util.concurrent.*;

public class FactoryExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadFactory tf = r -> {
            Thread t = new Thread(r, "worker-" + ThreadLocalRandom.current().nextInt(1000));
            t.setUncaughtExceptionHandler((thr, ex) ->
                    System.err.println(thr.getName() + " threw " + ex));
            return t;
        };
        ExecutorService exec = Executors.newFixedThreadPool(2, tf);
        exec.submit(() -> { throw new RuntimeException("oops"); });
        exec.shutdown();
        exec.awaitTermination(1, TimeUnit.SECONDS);
    }
}