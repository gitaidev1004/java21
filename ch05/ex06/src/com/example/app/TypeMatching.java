package com.example.app;

public class TypeMatching {
    public static void main(String[] args){
        Object obj = "hello";
        if (obj instanceof String s) {
            System.out.println(s.length()); // s는 이미 String으로 바인딩됨
        }
    }
}
