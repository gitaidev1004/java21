package com.example.app4;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        history.push("page1"); // 현재
        history.push("page2");
        history.push("page3");
        System.out.println("뒤로가기: " + history.pop()); // page3
        history.push("page4");
        System.out.println("현재페이지: " + history.peek()); // page4
    }
}