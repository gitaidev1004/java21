package com.example.app2;
class Parent {
    void print() { System.out.println("부모 클래스 메서드"); }
}

class Child extends Parent {
    @Override
    void print() { System.out.println("자식 클래스 메서드"); }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Parent obj = new Child();  // 업캐스팅
        obj.print();               // 자식 클래스 메서드 출력
    }
}