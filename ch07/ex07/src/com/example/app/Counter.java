package com.example.app;
public class Counter {
    private int count = 0;
    public void increment() {
        synchronized(this) {
            count++;
        }
    }
    public synchronized int get() { // 메서드 수준 동기화
        return count;
    }
}