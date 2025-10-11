package com.example.util;
import java.util.Date;
import java.util.Locale;
public class PrintExample {
    public static void main(String[] args) {
        double price = 1234567.891;
        System.out.printf("원화 표시: %, .2f원%n", price); // 주의: 공백은 포맷 예시 아님
        System.out.printf("정렬 예: %-15s %5s%n", "이름", "점수");
        System.out.printf("%-15s %5d%n", "홍길동", 95);
        Date now = new Date();
        System.out.printf("현재일시: %tF %tT%n", now, now);
        // Locale 예
        System.out.printf(Locale.US, "US 형식: %,.2f%n", price);
    }
}