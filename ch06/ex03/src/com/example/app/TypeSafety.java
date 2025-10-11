package com.example.app;

public class TypeSafety {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        int value = intBox.get(); // 형변환 불필요
        System.out.println(value);
    }
}