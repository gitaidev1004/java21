package com.example.app1;
interface Walkable {
    default void walk() {
        System.out.println("Walking on the ground.");
    }

    static void info() {
        System.out.println("Walkable entities can move on land.");
    }
}

class Cat implements Walkable {}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.walk(); // default 메서드 호출
        Walkable.info(); // static 메서드 호출
    }
}