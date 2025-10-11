package com.example.app;
import java.util.*;

public class VarBadExample {
    public static void main(String[] args) {
        // var x; // 컴파일 오류: 초기화식 필요
        // var n = null; // 컴파일 오류: null로는 타입 추론 불가
        // var a = 1, b = 2; // 컴파일 오류: 복합 선언 불가
        Object o = null;
        var maybe = o; // 허용되지만 타입은 Object로 추론되므로 가독성 저하 가능
        System.out.println(maybe);
    }
}