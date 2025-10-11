package com.example.exception;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    private final Map<String, String> books = new HashMap<>();

    public BookRepository() {
        books.put("100", "Effective Java");
        books.put("200", "Java Concurrency in Practice");
    }

    public String findById(String id) throws BookNotFoundException {
        String book = books.get(id);
        if (book == null) {
            // (4) ① throw 키워드 사용
            throw new BookNotFoundException("Book ID " + id + " not found in repository");
        }
        return book;
    }
}