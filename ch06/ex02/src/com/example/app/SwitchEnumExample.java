package com.example.app;
enum Season { SPRING, SUMMER, FALL, WINTER }

public class SwitchEnumExample {
    public static void main(String[] args) {
        Season s = Season.FALL;
        switch (s) {
            case SPRING -> System.out.println("꽃피는 봄");
            case SUMMER -> System.out.println("뜨거운 여름");
            case FALL -> System.out.println("풍성한 가을");
            case WINTER -> System.out.println("눈 내리는 겨울");
        }
    }
}