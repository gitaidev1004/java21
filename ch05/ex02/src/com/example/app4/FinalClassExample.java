package com.example.app4;
final class Vehicle {
    void move() {
        System.out.println("탈것이 이동합니다.");
    }
}

// class Car extends Vehicle { }  // 오류! final 클래스는 상속 불가

public class FinalClassExample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.move();
    }
}