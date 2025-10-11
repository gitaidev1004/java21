package com.example.app;

import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Orange");
        fruits.stream()
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);
    }
}