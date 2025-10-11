package com.example.app;

public class ArrayBasics {
    public static void main(String[] args) {
        // 선언 + 생성
        int[] nums = new int[5]; // 길이 5, 모든 요소는 0으로 초기화
        // 초기화 대입
        nums[0] = 10;
        nums[1] = 20;

        // 리터럴 초기화
        String[] names = {"Alice", "Bob", "Charlie"};

        // length와 인덱스 접근
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("nums[%d] = %d%n", i, nums[i]);
        }

        // 안전한 인덱스 접근 예 (범위 검사)
        int idx = 4;
        if (idx >= 0 && idx < nums.length) {
            System.out.println("접근 가능: " + nums[idx]);
        } else {
            System.out.println("인덱스 초과");
        }
    }
}