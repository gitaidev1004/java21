package com.example.app;

public class BreakExample {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i가 5이므로 반복 종료");
                break;
            }
            System.out.println("현재 i: " + i);
        }
    }
}
