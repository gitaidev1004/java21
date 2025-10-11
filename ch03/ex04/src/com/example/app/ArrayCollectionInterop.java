package com.example.app;
import java.util.*;

public class ArrayCollectionInterop {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        List<String> list = new ArrayList<>(Arrays.asList(arr)); // 가변 리스트

        // 리스트 -> 배열
        String[] arr2 = list.toArray(new String[list.size()]); // 권장
        System.out.println(Arrays.toString(arr2));

        // Arrays.stream 으로 처리
        int[] numbers = {1,2,3,4,5};
        int sum = Arrays.stream(numbers).filter(n -> n % 2 == 1).sum();
        System.out.println("odd sum = " + sum);
    }
}