package com.example.app;
import java.util.*;
import java.util.stream.*;

public class OptionalBasic {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("김기태");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null);

        System.out.println(name.isPresent());  // true
        System.out.println(empty.isEmpty());   // tru
    }
}