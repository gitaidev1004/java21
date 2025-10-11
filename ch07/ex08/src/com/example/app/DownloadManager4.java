package com.example.app;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class DownloadManager4 {
    private final ExecutorService exec;
    public DownloadManager4(ExecutorService exec) {
        this.exec = exec;
    }

    public void downloadAndMerge(String fileUrl, String outputFile, int numParts) throws InterruptedException, IOException {
        List<Future<Boolean>> futures = new ArrayList<>();
        for (int i = 0; i < numParts; i++) {
            int partIndex = i;
            futures.add(exec.submit(new DownloadManager3.DownloadPartTask(fileUrl, partIndex)));
        }
        int completed = 0;
        while (completed < numParts) {
            completed = 0;
            for (Future<Boolean> f : futures) {
                if (f.isDone()) completed++;
            }
            int percent = (completed * 100) / numParts;
            System.out.print("\r진행률: " + percent + "%");
            Thread.sleep(200);
        }
        System.out.println("\n모든 조각 다운로드 완료. 병합 시작...");

        // 조각 파일들을 하나로 합치기
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            for (int i = 0; i < numParts; i++) {
                File partFile = new File("part_" + i + ".tmp");
                try (FileInputStream fis = new FileInputStream(partFile)) {
                    fis.transferTo(fos);
                }
                partFile.delete();
            }
        }
        System.out.println("파일 병합 완료 → " + outputFile);
    }
    public void shutdown() {
        exec.shutdown();
    }
}