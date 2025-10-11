package com.example.app;

public class NamingRulesExample {
    private String userName; // lowerCamelCase 변수명
    private static final double TAX_RATE = 0.1; // 상수는 UPPER_SNAKE_CASE

    public NamingRulesExample(String userName) {
        this.userName = userName;
    }

    public void printUserName() { // 메서드는 동사 형태
        System.out.println("User: " + userName);
    }

    public boolean hasPermission() { // boolean은 is/has 접두사
        return true;
    }
}