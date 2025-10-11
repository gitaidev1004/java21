package com.example.app1;

class AnimalTrainer {
    void makeSound(Animal animal) {
        animal.sound(); // 다형적 호출
    }
}

public class TrainerTest {
    public static void main(String[] args) {
        AnimalTrainer trainer = new AnimalTrainer();
        trainer.makeSound(new Dog());
        trainer.makeSound(new Cat());
        trainer.makeSound(new Animal()); // 기존 코드 유지
    }
}