package com.example.app;
import java.util.Arrays;

public class ArraysAdvancedDemo {
    public static void main(String[] args) {
        int[] a = new int[6];
        Arrays.fill(a, 0, 3, 7); // a[0..2] = 7
        System.out.println("fill -> " + Arrays.toString(a));

        // setAll: index 기반 초기화 (함수형)
        int[] squares = new int[6];
        Arrays.setAll(squares, i -> i * i);
        System.out.println("squares -> " + Arrays.toString(squares));

        // parallelPrefix: 누적 합 (in-place)
        int[] vals = {1,2,3,4};
        Arrays.parallelPrefix(vals, Integer::sum); // vals becomes [1,3,6,10]
        System.out.println("prefix -> " + Arrays.toString(vals));

        // parallelSort for large arrays (may use multi-core)
        int[] big = {5,2,9,1,3};
        Arrays.parallelSort(big);
        System.out.println("parallelSort -> " + Arrays.toString(big));

        // mismatch: 첫번째 차이 인덱스
        int[] x = {1,2,3}, y = {1,2,4};
        System.out.println("mismatch = " + Arrays.mismatch(x,y)); // 2
    }
}