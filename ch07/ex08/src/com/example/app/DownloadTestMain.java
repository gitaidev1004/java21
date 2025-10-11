package com.example.app;
import java.util.*;
import java.util.concurrent.Executors;

public class DownloadTestMain {
    public static void main(String[] args) throws Exception {

        // ✅ ① DownloadManager2 테스트 코드 추가
        System.out.println("=== DownloadManager2 테스트 ===");
        Map<String, String> files = Map.of(
                "https://www.w3.org/TR/PNG/iso_8859-1.txt", "download1.txt",
                "https://www.w3.org/TR/2002/REC-xhtml1-20020801/xhtml1.pdf", "download2.pdf"
        );
        DownloadManager2 dm2 = new DownloadManager2(Executors.newFixedThreadPool(4));
        dm2.downloadFiles(files);
        dm2.shutdown();

        // ✅ ② 이후 기존 DownloadManager3~6 테스트 코드 유지
        String fakeUrl = "https://example.com/bigfile.zip";

        System.out.println("\n=== DownloadManager3 테스트 ===");
        DownloadManager3 dm3 = new DownloadManager3(Executors.newFixedThreadPool(4));
        dm3.downloadFile(fakeUrl, "output3.tmp", 5);
        dm3.shutdown();

        System.out.println("\n=== DownloadManager4 테스트 ===");
        DownloadManager4 dm4 = new DownloadManager4(Executors.newFixedThreadPool(4));
        dm4.downloadAndMerge(fakeUrl, "output4.tmp", 5);
        dm4.shutdown();

        System.out.println("\n=== DownloadManager5 (Virtual Threads) 테스트 ===");
        DownloadManager5 dm5 = new DownloadManager5();
        dm5.downloadFile(fakeUrl, 5);
        dm5.shutdown();

        System.out.println("\n=== DownloadManager6 (Virtual Threads + 상태) 테스트 ===");
        DownloadManager6 dm6 = new DownloadManager6();
        dm6.downloadWithStatus(fakeUrl, 5);
        dm6.shutdown();
    }
}