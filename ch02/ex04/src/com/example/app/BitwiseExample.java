package com.example.app;

public class BitwiseExample {
    public static void main(String[] args) {
        int flags = 0b0011; // 3
        int mask = 0b0010;
        System.out.println((flags & mask) != 0); // true (mask 비트 존재)

        int v = -16; // 0xFFFFFFF0
        System.out.println(v >> 2);  // 산술 시프트: sign bit 유지 -> -4
        System.out.println(v >>> 2); // 논리 시프트: 0 채움 -> 큰 양수

        byte b = (byte)0b1000_0001; // -127
        int unsigned = b & 0xFF; // 바이트를 unsigned로 해석
        System.out.println("unsigned b = " + unsigned);
    }
}