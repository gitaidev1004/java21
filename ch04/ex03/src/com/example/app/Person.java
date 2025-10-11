package com.example.app;

import java.util.ArrayList;
import java.util.List;

class Registry {
    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
        System.out.println(obj + " 등록 완료!");
    }

    public List<Object> getAll() {
        return list;
    }
}

public class Person {
    private String name;
    private int age;

    public Person() {
        this("무명", 0); // 생성자 체이닝
    }

    public Person(String name, int age) {
        this.name = name; // 필드-파라미터 혼동 해소
        this.age = age;
    }

    public Person setName(String name) {
        this.name = name;
        return this; // 메서드 체이닝 가능
    }

    public void register(Registry reg) {
        reg.add(this); // 현재 인스턴스를 외부로 전달
    }
}