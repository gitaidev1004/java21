package com.example.app;

import java.util.*;

public final class Order {
    private final UUID id;
    private final List<String> items; // 내부는 불변 리스트로 보관

    public Order(List<String> items) {
        this.id = UUID.randomUUID();
        // 방어적 복사 + 불변화
        this.items = List.copyOf(Objects.requireNonNull(items, "items"));
    }
    public UUID getId() { return id; }
    // 내부 리스트를 직접 노출하지 않고 읽기 전용 뷰 반환
    public List<String> getItems() {
        return items; // List.copyOf로 이미 불변화되어 안전
    }
}