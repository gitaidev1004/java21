package com.example.app1;
class Parent {
    void display() {
        System.out.println("부모 클래스의 display()");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("자식 클래스의 display()");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        p.display();   // 부모 클래스 메서드 호출
        c.display();   // 자식 클래스 메서드 호출
        pc.display();  // 오버라이딩된 자식 메서드 호출
    }
}