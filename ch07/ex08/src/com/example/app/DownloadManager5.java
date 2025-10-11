package com.example.app;

import java.util.concurrent.*;

public class DownloadManager5 {
    private final ExecutorService exec;
    public DownloadManager5() {
        // Virtual Thread 기반 Executor 생성
        this.exec = Executors.newVirtualThreadPerTaskExecutor();
    }

    public void downloadFile(String url, int numParts) throws InterruptedException {
        DownloadManager3 manager = new DownloadManager3(exec);
        manager.downloadFile(url, "output_virtual.txt", numParts);
    }

    public void shutdown() {
        exec.shutdown();
    }
}