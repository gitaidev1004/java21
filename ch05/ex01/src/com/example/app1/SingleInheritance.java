package com.example.app1;
class A { void msg() { System.out.println("A 클래스"); } }
class B { void msg() { System.out.println("B 클래스"); } }
// class C extends A, B { }  // 오류 발생!
class C extends A { }

public class SingleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.msg();
    }
}