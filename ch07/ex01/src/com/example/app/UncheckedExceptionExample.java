package com.example.app;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // ArrayIndexOutOfBoundsException 발생
    }
}