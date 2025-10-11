package com.example.app;

import java.util.*;

public class BoxingGenericExample {
    public static void main(String[] args) {
        Integer ii = null;
        // int val = ii; // NullPointerException at runtime

        List<Integer> ints = List.of(1,2,3);
        // List<Number> nums = (List<Number>) ints; // 컴파일 경고/런타임 위험
        List<? extends Number> nums = ints; // 안전: 읽기 전용(공변)
        for (Number n : nums) System.out.println(n);
    }
}