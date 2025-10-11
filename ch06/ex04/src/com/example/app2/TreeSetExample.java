package com.example.app2;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(85);
        scores.add(90);
        scores.add(75);
        System.out.println("정렬된 점수: " + scores);
        System.out.println("최고 점수: " + scores.last());
    }
}