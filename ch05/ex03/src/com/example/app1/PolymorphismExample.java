package com.example.app1;
class Animal {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("야옹~");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // 업캐스팅
        Animal a2 = new Cat(); // 업캐스팅

        a1.sound(); // 멍멍!
        a2.sound(); // 야옹~
    }
}