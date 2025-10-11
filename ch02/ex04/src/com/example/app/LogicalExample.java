package com.example.app;

public class LogicalExample {
    public static void main(String[] args) {
        String s = null;
        // 안전한 검사: short-circuit 사용
        if (s != null && s.length() > 0) {
            System.out.println("length>0");
        } else {
            System.out.println("null or empty");
        }

        // 비단축 연산자 사용 예
        boolean a = false;
        boolean b = (5 / 0 > 0); // ArithmeticException 발생
        // a & (5/0>0) // 실제로 평가되므로 예외 발생(사용 금지 상황)
    }
}