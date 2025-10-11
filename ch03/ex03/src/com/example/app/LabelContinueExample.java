package com.example.app;

public class LabelContinueExample {
    public static void main(String[] args){
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
