package com.example.app;
import java.util.*;
import java.util.concurrent.*;

public class DownloadManager2 {
    private final ExecutorService exec;
    public DownloadManager2(ExecutorService exec) { this.exec = exec; }
    public void downloadFiles(Map<String,String> files) throws InterruptedException {
        List<Future<Boolean>> futures = new ArrayList<>();
        for(var entry : files.entrySet()) {
            futures.add(exec.submit(new DownloadTask(entry.getKey(), entry.getValue())));
        }
        for(int i=0;i<futures.size();i++) {
            try { boolean success=futures.get(i).get();
                System.out.println(files.values().toArray()[i] + " 다운로드 " + (success?"완료":"실패"));
            } catch(Exception e) { e.printStackTrace(); }
        }
    }
    public void shutdown() { exec.shutdown(); }
}