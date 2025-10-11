package com.example.app;

class Car {
    private String model = "Avante";
    class Engine {
        void start() {
            System.out.println(model + " 엔진이 시동됩니다.");
        }
    }
}

public class InnerExample {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.start();
    }
}