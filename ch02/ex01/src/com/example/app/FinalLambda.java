package com.example.app;
import java.util.function.Supplier;

public class FinalLambda {
    public static void main(String[] args) {
        final int a = 5;
        int b = 10; // effectively final 인 경우(재할당 없으면)
        Supplier<Integer> s1 = () -> a + b; // 둘 다 사용 가능
        System.out.println(s1.get());
        // b = 20; // 만약 여기서 b를 변경하면 위 람다에서 b 사용은 컴파일 오류 발생
    }
}