package com.example.app;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Car 클래스의 인스턴스 생성
        myCar.model = "소나타";
        myCar.speed = 120;
        myCar.drive();
    }
}