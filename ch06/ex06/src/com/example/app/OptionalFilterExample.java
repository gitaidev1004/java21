package com.example.app;
import java.util.*;
import java.util.stream.*;

public class OptionalFilterExample {
    public static void main(String[] args) {
        Optional<Integer> number = Optional.of(42);
        number.filter(n -> n > 50)
                .ifPresentOrElse(
                        n -> System.out.println("큰 값: " + n),
                        () -> System.out.println("조건 불충족")
                );
    }
}