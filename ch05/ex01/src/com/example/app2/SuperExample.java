package com.example.app2;
class Parent {
    int value = 10;
    void show() {
        System.out.println("부모의 show() 호출");
    }
}

class Child extends Parent {
    int value = 20;
    void show() {
        super.show();  // 부모 메서드 호출
        System.out.println("자식의 show() 호출");
        System.out.println("부모 value = " + super.value);
        System.out.println("자식 value = " + this.value);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}