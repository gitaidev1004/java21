package com.example.app;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class DownloadManager3 {
    private final ExecutorService exec;
    public DownloadManager3(ExecutorService exec) {
        this.exec = exec;
    }

    // 파일을 N개의 조각으로 나눠 병렬 다운로드
    public void downloadFile(String fileUrl, String outputFile, int numParts) throws InterruptedException {
        List<Future<Boolean>> futures = new ArrayList<>();
        for (int i = 0; i < numParts; i++) {
            int partIndex = i;
            futures.add(exec.submit(new DownloadPartTask(fileUrl, partIndex)));
        }
        // 모든 조각의 완료 여부 확인
        for (int i = 0; i < futures.size(); i++) {
            try {
                boolean success = futures.get(i).get();
                System.out.println("조각 " + i + " 다운로드 " + (success ? "성공" : "실패"));
            } catch (ExecutionException e) {
                System.out.println("조각 " + i + " 다운로드 중 예외: " + e.getMessage());
            }
        }
    }
    public void shutdown() {
        exec.shutdown();
    }

    // 조각 다운로드 작업 (시뮬레이션)
    static class DownloadPartTask implements Callable<Boolean> {
        private final String url;
        private final int part;
        DownloadPartTask(String url, int part) {
            this.url = url;
            this.part = part;
        }
        @Override
        public Boolean call() {
            try {
                System.out.println("[Part " + part + "] " + url + " 다운로드 중...");
                Thread.sleep(500 + (int) (Math.random() * 1000));
                try (FileWriter fw = new FileWriter("part_" + part + ".tmp")) {
                    fw.write("데이터-" + part);
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }
}