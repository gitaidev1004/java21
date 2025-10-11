package com.example.app;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ArraysStreamDemo {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        int sum = Arrays.stream(nums).sum(); // primitive IntStream.sum()
        OptionalDouble avg = Arrays.stream(nums).average();
        int max = Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
        long oddCount = Arrays.stream(nums).filter(n -> n % 2 == 1).count();

        System.out.println("sum=" + sum + ", avg=" + avg + ", max=" + max + ", oddCount=" + oddCount);

        // primitive -> boxed -> list
        java.util.List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println("boxed list = " + list);
    }
}