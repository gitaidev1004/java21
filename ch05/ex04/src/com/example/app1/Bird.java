package com.example.app1;
interface Flyable {
    void fly();
}

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }
}