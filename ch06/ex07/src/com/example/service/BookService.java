package com.example.service;
import com.example.model.Book;
import com.example.repository.BookRepository;

import java.util.*;

public class BookService {
    private final BookRepository repo = new BookRepository();

    public void addBook(Book book) { repo.add(book); }

    public void searchByTitle(String keyword) {
        repo.findAll().stream()
                .filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .forEach(System.out::println);
    }

    public void sortByPrice() {
        repo.findAll().stream()
                .sorted(Comparator.comparingDouble(Book::getPrice))
                .forEach(System.out::println);
    }

    public void removeBook(int id) {
        repo.remove(id);
        System.out.println("도서 ID " + id + "가 삭제되었습니다.");
    }
}