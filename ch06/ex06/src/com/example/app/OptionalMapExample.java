package com.example.app;
import java.util.*;
import java.util.stream.*;

public class OptionalMapExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("김대철");
        Optional<Integer> length = name.map(String::length);
        System.out.println(length.orElse(0));  // 5

        Optional<Optional<String>> nested = name.map(n -> Optional.of(n.toUpperCase()));
        Optional<String> flat = name.flatMap(n -> Optional.of(n.toUpperCase()));
    }
}