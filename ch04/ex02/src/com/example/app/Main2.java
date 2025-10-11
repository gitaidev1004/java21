package com.example.app;

class Car2 {
    String model;
    int speed;
}

public class Main2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.model = "그랜저";
        car1.speed = 100;

        Car car2 = new Car();
        car2.model = "아반떼";
        car2.speed = 80;

        System.out.println(car1.model + ": " + car1.speed);
        System.out.println(car2.model + ": " + car2.speed);
    }
}