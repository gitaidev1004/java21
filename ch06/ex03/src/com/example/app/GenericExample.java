package com.example.app;

class Box<T> {
    private T item;
    public void set(T item) { this.item = item; }
    public T get() { return item; }
}

public class GenericExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        System.out.println(stringBox.get());
    }
}