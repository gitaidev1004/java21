package com.example.app;

public class ReturnGenericExample {
    public static <T> T getFirstElement(T[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Park"};
        System.out.println(getFirstElement(names)); // Kim
    }
}