package com.example.app;
class Animal { void speak(){ System.out.println("..."); } }
class Dog extends Animal { void speak(){ System.out.println("Woof"); } void fetch(){ System.out.println("fetch"); } }

public class ReferenceCast {
    public static void main(String[] args) {
        Animal a = new Dog(); // 업캐스트, 안전
        a.speak();            // 다형성: Dog.speak 실행

        if (a instanceof Dog) {
            Dog d = (Dog) a;  // 다운캐스트 안전
            d.fetch();
        }

        Animal a2 = new Animal();
        // Dog d2 = (Dog) a2; // 런타임 ClassCastException
    }
}