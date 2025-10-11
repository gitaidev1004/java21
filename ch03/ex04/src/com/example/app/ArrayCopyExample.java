package com.example.app;
import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] src = {1,2,3,4,5};
        int[] dest = new int[7];
        System.arraycopy(src, 0, dest, 0, src.length); // dest = [1,2,3,4,5,0,0]
        System.out.println(Arrays.toString(dest));

        int[] copy = Arrays.copyOf(src, 3); // 부분 복사: [1,2,3]
        System.out.println(Arrays.toString(copy));

        // 참조형 배열 얕은 복사 예
        String[] a = {"x","y"};
        String[] b = Arrays.copyOf(a, a.length);
        b[0] = "z"; // 문자열은 불변이라 문제 없지만 mutable 객체면 공유 이슈 발생
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}