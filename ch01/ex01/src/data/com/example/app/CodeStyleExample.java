package com.example.app;

import java.util.List;
public class CodeStyleExample {
    private static final int MAX_SIZE = 100; // 상수는 UPPER_SNAKE_CASE

    public void printList(List<String> items) {
        for (String item : items) { // K&R 스타일 중괄호
            System.out.println(item);
        }
    }

    public boolean isValid(int size) {
        return size > 0 && size <= MAX_SIZE; // 공백을 활용한 가독성
    }
}