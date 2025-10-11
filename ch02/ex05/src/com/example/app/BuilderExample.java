package com.example.app;

public class BuilderExample {
    public static void main(String[] args) {
        // 나쁜 예: 루프 내 + 사용 -> 많은 String 객체 생성
        String s = "";
        for (int i = 0; i < 5; i++) {
            s = s + i + ",";
        }
        System.out.println(s);

        // 좋은 예: StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i).append(",");
        }
        String result = sb.toString();
        System.out.println(result);

        // StringBuffer 예 (동기화 필요할 때)
        StringBuffer syncBuf = new StringBuffer();
        syncBuf.append("thread-safe");
        System.out.println(syncBuf.toString());
    }
}