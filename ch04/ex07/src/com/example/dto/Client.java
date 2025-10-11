package com.example.dto;
public record Client(int id, String name) {
    public Client {
        if (id <= 0) throw new IllegalArgumentException("id>0 필요");
        name = name == null ? "unknown" : name.trim();
    }
}