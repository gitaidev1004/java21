package com.example.app3;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Kim", 95);
        students.put("Lee", 88);
        students.put("Park", 92);

        System.out.println("학생 점수: " + students);
        System.out.println("Kim의 점수: " + students.get("Kim"));

        students.remove("Lee");
        System.out.println("삭제 후: " + students);
    }
}