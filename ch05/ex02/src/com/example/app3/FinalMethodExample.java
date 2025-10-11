package com.example.app3;
class Parent {
    final void show() {
        System.out.println("이 메서드는 재정의할 수 없습니다.");
    }
}

class Child extends Parent {
    // void show() { }  // 오류! final 메서드는 오버라이딩 불가
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}