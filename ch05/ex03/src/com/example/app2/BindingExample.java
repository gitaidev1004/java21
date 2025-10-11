package com.example.app2;
class BindingTest {
    static void staticMethod() {
        System.out.println("정적 메서드 호출");
    }

    void instanceMethod() {
        System.out.println("인스턴스 메서드 호출");
    }
}

public class BindingExample {
    public static void main(String[] args) {
        BindingTest test = new BindingTest();
        test.staticMethod();     // 정적 바인딩
        test.instanceMethod();   // 동적 바인딩
    }
}