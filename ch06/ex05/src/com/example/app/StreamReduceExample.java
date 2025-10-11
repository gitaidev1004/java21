package com.example.app;
import java.util.*;
import java.util.stream.*;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> scores = List.of(90, 70, 80, 100);

        int total = scores.stream()
                .reduce(0, (a, b) -> a + b);  // 누적 합계

        double avg = scores.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);  // 평균 계산
        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);
    }
}