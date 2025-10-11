package com.example.app;

class Account {
    private int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println("현재 잔액: " + acc.getBalance());
    }
}