package com.example.app;

import java.util.*;

public class LowerBoundExample {
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        addIntegers(numList);
        System.out.println(numList);
    }
}