package com.example.app;

import java.util.UUID;

public class User {
    // static 필드 (클래스 단위 공유)
    private static int userCount = 0;

    // 인스턴스 필드 (각 객체별)
    private String name;          // 기본값 null
    private final UUID id;        // final 인스턴스 필드, 생성자에서 초기화

    // 인스턴스 초기화 블록
    {
        // 공통 초기화 로직
        System.out.println("새 User 객체 초기화 블록 실행");
    }

    // static 초기화 블록
    static {
        System.out.println("User 클래스 로딩 시 static 초기화 실행");
    }

    public User(String name) {
        this.name = name;
        this.id = UUID.randomUUID(); // final 필드 초기화
        userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }
}