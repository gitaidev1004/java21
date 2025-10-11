package com.example.app;

public class OverflowExample {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        long larger = big + 1L; // 안전
        int back = (int) (larger + 1); // 캐스트: overflow 가능
        System.out.println("larger=" + larger + ", back=" + back);
    }
}