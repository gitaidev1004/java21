package com.example.app;
public class CharBooleanExample {
    public static void main(String[] args) {
        char c1 = 'A';           // 문자 리터럴
        char c2 = 65;            // 문자 코드 값 (A)
        char c3 = '\uAC00';      // 유니코드 (가)
        boolean isJava = true;
        boolean result = (10 > 5);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("isJava: " + isJava);
        System.out.println("result: " + result);
    }
}