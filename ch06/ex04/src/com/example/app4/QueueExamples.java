package com.example.app4;
import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();
        printQueue.offer("Job1");
        printQueue.offer("Job2");
        System.out.println(printQueue.poll()); // Job1
        System.out.println(printQueue.peek()); // Job2
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // PriorityQueue: 우선순위 낮은 값 먼저
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll()); // 10 (최소값)
    }
}