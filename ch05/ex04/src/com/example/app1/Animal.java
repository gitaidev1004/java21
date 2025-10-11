package com.example.app1;
public abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound(); // 추상 메서드

    void eat() {
        System.out.println(name + " is eating.");
    }
}