package com.example.app;

public class AssignmentExample {
    public static void main(String[] args) {
        byte b = 100;
        // b = b + 1; // 컴파일 오류: b+1은 int
        b += 1; // OK: 내부 캐스트 포함

        short s = 10;
        s += 3; // OK
        // s = s + 3; // 오류: 결과는 int

        int x = 5;
        x *= 2.5; // x = (int)(x * 2.5) -> 12 (명시적 캐스트 포함)
        System.out.println(x);
    }
}