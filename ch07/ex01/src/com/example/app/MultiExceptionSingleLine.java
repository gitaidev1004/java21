package com.example.app;

public class MultiExceptionSingleLine {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("예외 발생: " + e.getClass().getSimpleName());
        }
    }
}