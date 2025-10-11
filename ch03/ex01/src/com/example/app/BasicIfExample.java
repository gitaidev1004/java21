package com.example.app;

public class BasicIfExample {
    public static void main(String[] args){
        int score = 85;
        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else {
            System.out.println("C 학점");
        }
    }
}
