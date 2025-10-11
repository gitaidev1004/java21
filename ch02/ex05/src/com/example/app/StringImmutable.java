package com.example.app;

public class StringImmutable {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";                 // 같은 리터럴 공유 (== true)
        System.out.println(a == b);        // true

        String c = new String("hello");    // 새 객체 생성
        System.out.println(a == c);        // false
        System.out.println(a.equals(c));   // true

        // 불변성 예: 변경 시 새 객체
        String s = "ab";
        s = s + "c";                       // 새로운 String이 생성됨
        System.out.println(s);             // "abc"

        // intern 사용
        String x = new String("world").intern();
        String y = "world";
        System.out.println(x == y);        // true
    }
}