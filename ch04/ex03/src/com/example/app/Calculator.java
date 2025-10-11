package com.example.app;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // static 유틸리티 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    // 오버로딩: 같은 이름, 다른 시그니처
    public double add(double a, double b) {
        return a + b;
    }

    // 인스턴스 메서드: 객체 상태를 변경
    private int total = 0;
    public void accumulate(int v) {
        this.total += v;
    }
    public int getTotal() { return total; }

    // 파라미터 전달 예시
    public void tryToReplace(List<String> list) {
        list.add("mutated");     // 호출자에게 반영됨 (참조가 가리키는 객체 변경)
        list = new ArrayList<>(); // 로컬 참조 재할당: 호출자 영향 없음
    }
}