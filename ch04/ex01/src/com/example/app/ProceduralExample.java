package com.example.app;
import java.util.*;
import java.util.stream.*;

public class ProceduralExample {
    static int balance = 0;

    static void deposit(int amount) {
        balance += amount;
    }

    static void withdraw(int amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        deposit(1000);
        withdraw(300);
        System.out.println("현재 잔액: " + balance);
    }
}