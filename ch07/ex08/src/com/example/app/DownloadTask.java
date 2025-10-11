package com.example.app;
import java.io.*;
import java.net.*;
import java.util.concurrent.Callable;

public class DownloadTask implements Callable<Boolean> {
    private final String fileUrl;
    private final String destPath;
    public DownloadTask(String fileUrl, String destPath) {
        this.fileUrl = fileUrl;
        this.destPath = destPath;
    }
    @Override
    public Boolean call() {
        try (InputStream in = new URL(fileUrl).openStream();
             OutputStream out = new FileOutputStream(destPath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while((bytesRead = in.read(buffer)) != -1) out.write(buffer, 0, bytesRead);
            return true;
        } catch(IOException e) {
            System.err.println("다운로드 실패: " + destPath + " (" + e.getMessage() + ")");
            return false;
        }
    }
}