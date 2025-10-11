package com.example.app;
import java.util.*;
import java.util.concurrent.*;

public class DownloadManager6 {
    private final ExecutorService exec;
    private final Map<Integer, String> statusMap = new ConcurrentHashMap<>();
    public DownloadManager6() {
        this.exec = Executors.newVirtualThreadPerTaskExecutor();
    }

    public void downloadWithStatus(String url, int numParts) throws InterruptedException {
        List<Future<Boolean>> futures = new ArrayList<>();
        for (int i = 0; i < numParts; i++) {
            final int part = i;
            futures.add(exec.submit(() -> {
                statusMap.put(part, "다운로드 중");
                boolean result = new DownloadManager3.DownloadPartTask(url, part).call();
                statusMap.put(part, result ? "완료" : "실패");
                return result;
            }));
        }
        while (true) {
            long done = statusMap.values().stream().filter(s -> s.equals("완료") || s.equals("실패")).count();
            System.out.print("\r진행 상태: " + done + "/" + numParts);
            if (done == numParts) break;
            Thread.sleep(200);
        }
        System.out.println("\n상세 상태:");
        statusMap.forEach((k, v) -> System.out.println(" - Part " + k + ": " + v));
    }
    public void shutdown() {
        exec.shutdown();
    }
}