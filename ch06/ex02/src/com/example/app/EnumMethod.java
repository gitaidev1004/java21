package com.example.app;

public class EnumMethod {
    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d);
        }
        Day day = Day.valueOf("FRIDAY");
        System.out.println("선택된 요일: " + day);
    }
}