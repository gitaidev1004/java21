package com.example.app;

public class SwitchEnumReturn {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        String message = switch (s) {
            case SPRING -> "꽃이 피었습니다";
            case SUMMER -> "무더운 여름입니다";
            case FALL -> "풍성한 수확의 계절입니다";
            case WINTER -> "추운 겨울이 왔습니다";
        };
        System.out.println(message);
    }
}