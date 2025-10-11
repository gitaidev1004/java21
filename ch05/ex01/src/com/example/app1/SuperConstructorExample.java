package com.example.app1;
class Parent {
    Parent(String name) {
        System.out.println("부모 생성자: " + name);
    }
}

class Child extends Parent {
    Child(String name) {
        super(name);  // 부모 클래스 생성자 호출
        System.out.println("자식 생성자: " + name);
    }
}

public class SuperConstructorExample {
    public static void main(String[] args) {
        Child c = new Child("홍길동");
    }
}