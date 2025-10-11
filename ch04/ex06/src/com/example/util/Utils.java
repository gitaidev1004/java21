package com.example.util;
public class Utils {
    public static final double PI = 3.141592653589793;
    private static int counter = 0;

    static { // static 초기화 블록
        System.out.println("Utils 클래스 로딩: static 초기화 실행");
        counter = 100; // 초기값 설정
    }

    public static int nextId() {
        return ++counter; // static 상태 변경: 동시성 주의
    }

    public static String greet(String name) {
        return "Hello, " + name;
    }
}