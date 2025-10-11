package com.example.app;

enum Grade {
    BASIC("일반"), SILVER("은"), GOLD("금"), PLATINUM("백금");

    private final String label;

    Grade(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

public class GradeExample {
    public static void main(String[] args) {
        for (Grade g : Grade.values()) {
            System.out.println(g + " 등급: " + g.getLabel());
        }
    }
}