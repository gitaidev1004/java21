package com.example.app1;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Kim");
        names.add("Lee");
        names.addFirst("Park");
        names.addLast("Choi");
        System.out.println("이름 목록: " + names);
        names.removeFirst();
        System.out.println("첫 번째 요소 삭제 후: " + names);
    }
}