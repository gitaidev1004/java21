package com.example.app;

public class PromotionExample {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        // byte sum = b1 + b2; // 컴파일 오류: b1+b2는 int
        byte sum = (byte) (b1 + b2); // 명시적 캐스트 필요
        System.out.println("sum=" + sum);

        int i = 5;
        double res = i + 2.5; // i가 double로 승격되어 double 연산
        System.out.println("res=" + res);

        byte b = 1;
        b += 2; // OK: 컴파운드 어시그먼트는 내부적으로 캐스트 수행
    }
}