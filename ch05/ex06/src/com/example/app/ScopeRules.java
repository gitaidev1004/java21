package com.example.app;

public class ScopeRules {
    public static void main(String[] args){
        Object obj = "abc";
        if (obj instanceof String s) {
            System.out.println(s); // ok
        }
        //System.out.println(s); // 컴파일 오류: s는 이 바깥에서 존재하지 않음
    }
}
