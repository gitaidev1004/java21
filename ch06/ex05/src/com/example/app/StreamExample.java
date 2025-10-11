package com.example.app;
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Kim", "Lee", "Park", "Choi", "Kim");
        names.stream()                        // Stream 생성
                .filter(n -> n.startsWith("K"))  // 중간 연산: 필터
                .distinct()                      // 중복 제거
                .sorted()                        // 정렬
                .forEach(System.out::println);   // 최종 연산: 출력
    }
}