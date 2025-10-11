package com.example.app;

public class SwitchExpressions {
    public static void main(String[] args){
        String grade = "B";
        String result = switch (grade) {
            case "A" -> "우수";
            case "B", "C" -> "보통";
            case "D" -> {
                System.out.println("주의 요망");
                yield "부진";
            }
            default -> "미등급";
        };
        System.out.println(result);
    }
}
