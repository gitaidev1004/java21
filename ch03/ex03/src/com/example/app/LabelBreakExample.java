package com.example.app;

public class LabelBreakExample {
    public static void main(String[] args){
        outer: // 바깥쪽 반복문에 label 지정
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("i=2, j=2 → 전체 반복 종료");
                    break outer;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
