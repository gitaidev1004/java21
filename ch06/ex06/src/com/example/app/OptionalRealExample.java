package com.example.app;
import java.util.*;

class User {
    private String name;
    private String email;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getEmail() { return email; }
}

public class OptionalRealExample {
    public static void main(String[] args) {
        Optional<User> user = findUser("Gitai");

        String email = user
                .map(User::getEmail)
                .filter(e -> e.contains("@"))
                .orElse("no-email@domain.com");

        System.out.println("User email: " + email);
    }

    static Optional<User> findUser(String name) {
        if ("Gitai".equals(name))
            return Optional.of(new User("Gitai", "gitai1004@example.com"));
        return Optional.empty();
    }
}