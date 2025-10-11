package com.example.dto;
public record Person(String name, int age) { }
// 컴파일러가 자동 생성:
// public String name() { ... }
// public int age() { ... }
// public boolean equals(Object o) {...}, hashCode(), toString()