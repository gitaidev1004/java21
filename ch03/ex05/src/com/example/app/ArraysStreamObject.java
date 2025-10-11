package com.example.app;

import java.util.*;
import java.util.stream.*;

record Person(String name, int age) {}

public class ArraysStreamObject {
    public static void main(String[] args) {
        Person[] people = { new Person("김기태",30), new Person("함창훈",25), new Person("김기태",35) };

        // 이름별 수 집계 (groupingBy)
        Map<String, Long> counts = Arrays.stream(people)
                .collect(Collectors.groupingBy(Person::name, Collectors.counting()));
        System.out.println("counts = " + counts); // {Alice=2, Bob=1}

        // 나이 평균
        double avgAge = Arrays.stream(people).mapToInt(Person::age).average().orElse(0);
        System.out.println("avgAge = " + avgAge);
    }
}