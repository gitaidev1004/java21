package com.example.app;
import java.util.concurrent.locks.*;

public class LockCounter {
    private final ReentrantLock lock = new ReentrantLock();
    private int cnt = 0;
    public void increment() {
        lock.lock();
        try {
            cnt++;
        } finally {
            lock.unlock();
        }
    }
    public int get() { return cnt; }
}