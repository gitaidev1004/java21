package com.example.app2;
class Calculator {
    int add(int a, int b) { return a + b; }           // 오버로딩 ①
    double add(double a, double b) { return a + b; }  // 오버로딩 ②
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {  // 오버라이딩
        System.out.println("두 정수의 합을 계산합니다.");
        return a + b;
    }
}

public class OverloadingOverriding {
    public static void main(String[] args) {
        AdvancedCalculator cal = new AdvancedCalculator();
        System.out.println(cal.add(10, 20));      // 오버라이딩된 메서드 호출
        System.out.println(cal.add(3.5, 4.5));    // 오버로딩된 메서드 호출
    }
}