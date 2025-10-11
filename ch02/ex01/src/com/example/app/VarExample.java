package com.example.app;
import java.util.*;

public class VarExample {
    public static void main(String[] args) {
        var message = "Hello, Java 21";             // String으로 추론
        var count = 42;                             // int로 추론 (기본형 int)
        var list = new ArrayList<String>();         // ArrayList<String>으로 추론
        for (var item : List.of("a","b","c")) {     // for-each에서도 사용 가능
            System.out.println(item.toUpperCase());
        }
        System.out.println(message + " / count:" + count);
    }
}