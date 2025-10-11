package com.example.model;

import java.util.UUID;

public class User {                // public: 외부 패키지에서 사용 가능
    private String password;       // private: 외부에서 직접 접근 불가 (은닉)
    String username;               // package-private: 같은 패키지에서 접근 가능
    protected int reputation;       // protected: 같은 패키지와 서브클래스 접근 허용
    public final UUID id;           // public: 어디서든 접근 가능 (읽기 전용 의도)

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = UUID.randomUUID();
    }

    private void hashPassword() { /* 비공개 로직 */ }
    public String getUsername() { return username; }
}