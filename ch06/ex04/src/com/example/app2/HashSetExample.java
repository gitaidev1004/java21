package com.example.app2;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Seoul");
        cities.add("Busan");
        cities.add("Seoul"); // 중복 무시
        System.out.println("저장된 도시: " + cities);
    }
}