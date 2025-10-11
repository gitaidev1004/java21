package com.example.app;
import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private transient String password; // 직렬화 제외

    public Member(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return "Member[name=" + name + ", password=" + password + "]";
    }
}