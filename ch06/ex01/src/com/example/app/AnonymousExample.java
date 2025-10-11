package com.example.app;

interface ClickListener {
    void onClick();
}

public class AnonymousExample {
    public static void main(String[] args) {
        ClickListener button = new ClickListener() {
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다!");
            }
        };
        button.onClick();
    }
}