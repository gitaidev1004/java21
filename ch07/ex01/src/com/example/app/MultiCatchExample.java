package com.example.app;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2};
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 오류");
        } catch (Exception e) {
            System.out.println("기타 오류");
        }
    }
}