package com.example.app;

class Person {
    String name;
}

public class Main3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "김기태";

        Person p2 = p1; // 주소 복사
        p2.name = "함창훈";

        System.out.println(p1.name); // 출력: 함창훈
    }
}