package com.example.app;

import java.util.*;

public class Person {
    // static 필드 및 static 초기화 블록
    private static final Set<String> RESERVED_NAMES;
    static {
        RESERVED_NAMES = new HashSet<>();
        RESERVED_NAMES.add("Admin");
        RESERVED_NAMES.add("System");
        System.out.println("Person class static init block executed");
    }

    // 인스턴스 필드와 선언부 초기화
    private final UUID id;         // final 필드: 반드시 생성자나 초기화 블록에서 초기화해야 함
    private String name = "unknown";
    private int age;

    // 인스턴스 초기화 블록
    {
        System.out.println("Person instance init block executed");
        // 공통 초기화 로직(예: 로그, 기본 값 조정) 가능
    }

    // 기본 생성자 (파라미터 없음)
    public Person() {
        this("no-name", 0); // 생성자 체이닝: 다른 생성자에 위임
        System.out.println("default constructor finished");
    }

    // 매개변수 생성자
    public Person(String name, int age) {
        // 유효성 검사
        if (name == null) throw new NullPointerException("name is required");
        if (age < 0) throw new IllegalArgumentException("age must be non-negative");

        // 방어적 복사/할당 및 final 초기화
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        System.out.println("param constructor executed");
    }

    // private 생성자 (팩토리/싱글턴용 예시)
    private Person(UUID id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // static factory 예시
    public static Person withId(UUID id, String name, int age) {
        // 팩토리에서 복잡한 로직 또는 캐싱 수행 가능
        return new Person(id, name, age);
    }
    // 방어적 복사 예시: 가변 컬렉션을 필드로 보낼 때
    private final List<String> tags = new ArrayList<>();
    public void setTags(Collection<String> input) {
        tags.clear();
        if (input != null) tags.addAll(input); // defensive copy: 새로운 리스트에 복사
    }
    // getter
    public UUID getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
}