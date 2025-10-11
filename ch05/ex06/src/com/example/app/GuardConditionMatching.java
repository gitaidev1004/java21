package com.example.app;

public class GuardConditionMatching {
    public static void main(String[] args){
        Object o = "abcdef";
        if (o instanceof String s && s.length() > 3) {
            System.out.println("길이 3 초과: " + s);
        }
    }
}
