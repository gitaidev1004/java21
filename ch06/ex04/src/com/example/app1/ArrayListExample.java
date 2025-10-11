package com.example.app1;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("전체 과일 목록: " + fruits);
        fruits.remove("Banana");
        System.out.println("삭제 후: " + fruits);
        System.out.println("첫 번째 과일: " + fruits.get(0));
    }
}