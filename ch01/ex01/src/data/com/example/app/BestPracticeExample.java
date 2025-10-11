package com.example.app;

import java.util.Optional;

public class BestPracticeExample implements AutoCloseable {
    private final String resource;
    public BestPracticeExample(String resource) {
        this.resource = resource;
    }
    public Optional<String> getResource() {
        return Optional.ofNullable(resource);
    }

    @Override
    public void close() {
        System.out.println("Resource closed safely.");
    }
    public static void main(String[] args) {
        try (BestPracticeExample ex = new BestPracticeExample("File.txt")) {
            ex.getResource().ifPresent(System.out::println);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}