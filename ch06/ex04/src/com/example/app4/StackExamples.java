package com.example.app4;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();          // 전통 Stack
        stack.push("A");
        stack.push("B");
        System.out.println(stack.peek()); // B
        System.out.println(stack.pop());  // B
        System.out.println(stack.empty());// false
        Deque<String> deque = new ArrayDeque<>();         // 권장: ArrayDeque as Stack
        deque.push("X"); // 동작은 push/pop과 동일
        deque.push("Y");
        System.out.println(deque.pop()); // Y
    }
}