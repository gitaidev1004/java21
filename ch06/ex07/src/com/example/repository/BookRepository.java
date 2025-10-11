package com.example.repository;
import com.example.model.Book;

import java.util.*;

public class BookRepository {
    private final Map<Integer, Book> books = new HashMap<>();

    public void add(Book book) { books.put(book.getId(), book); }

    public Optional<Book> findById(int id) {
        return Optional.ofNullable(books.get(id));
    }

    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    public void remove(int id) { books.remove(id); }
}