package com.example.app;
import java.util.*;
import java.util.stream.*;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> user = Optional.ofNullable("함창훈");

        user.ifPresent(u -> System.out.println("User: " + u));
        System.out.println(user.orElse("Anonymous"));
    }
}