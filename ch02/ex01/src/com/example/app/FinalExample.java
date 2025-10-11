package com.example.app;
import java.util.*;

public class FinalExample {
    public static final int MAX_USERS = 100; // 컴파일타임 상수(관례적 표기)

    private final List<String> names; // final 참조: 재할당 불가하지만 내부 변경 가능

    public FinalExample() {
        this.names = new ArrayList<>(); // 한 번 할당 가능
    }

    public void addName(String name) {
        names.add(name); // 참조는 final이지만 내부 상태는 변경 가능
    }

    public static void main(String[] args) {
        final int x = 10; // 로컬 final 변수: 재할당 불가
        FinalExample ex = new FinalExample();
        ex.addName("김기태");
        System.out.println(ex.names);
        // x = 20; // 컴파일 오류
    }
}