package com.example.app;
import java.util.*;
public class MethodReference {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Orange", "Banana");
        fruits.stream()
                .map(String::toUpperCase)     // 메서드 참조
                .forEach(System.out::println); // 출력 참조
    }
}