package com.example.app;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysUtilDemo {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 3};
        Arrays.sort(nums); // primitives: fast native sort
        System.out.println("sorted: " + Arrays.toString(nums)); // [1,2,3,5,9]

        int idx = Arrays.binarySearch(nums, 3); // array must be sorted
        System.out.println("index of 3 = " + idx);

        int[] bigger = Arrays.copyOf(nums, 8); // new length 8, tail filled with 0
        System.out.println("copyOf -> " + Arrays.toString(bigger));

        int[] part = Arrays.copyOfRange(nums, 1, 4); // [2,3,5)
        System.out.println("copyOfRange -> " + Arrays.toString(part));

        // multi-dim deepToString / deepEquals
        int[][] mat = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(mat)); // [[1,2], [3,4]]
    }
}