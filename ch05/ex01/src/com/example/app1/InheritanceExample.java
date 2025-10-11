package com.example.app1;

class Animal {
    void eat() {
        System.out.println("동물이 먹고 있습니다.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("강아지가 짖습니다.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // 부모 클래스의 메서드 호출
        dog.bark();  // 자식 클래스의 메서드 호출
    }
}