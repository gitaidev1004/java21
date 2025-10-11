package com.example.app;
public class IntegerTypes {
    public static void main(String[] args) {
        byte b = 100;               // 1바이트 (-128~127)
        short s = 30000;            // 2바이트 (-32768~32767)
        int i = 1_000_000;          // 4바이트, 언더스코어 사용
        long l = 10_000_000_000L;   // 8바이트, L 접미사 필수
        int bin = 0b1010;           // 2진수 (10)
        int hex = 0x1A;             // 16진수 (26)
        System.out.printf("b=%d, s=%d, i=%d, l=%d, bin=%d, hex=%d%n",
                b, s, i, l, bin, hex);
    }
}