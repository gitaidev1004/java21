package com.example.app;
import com.example.model.Book;
import com.example.service.BookService;

import java.util.*;

public class BookApp {
    public static void main(String[] args) {
        BookService service = new BookService();

        service.addBook(new Book(1, "Vue.js Fullstack", "Kim Gitae", 38000, 5));
        service.addBook(new Book(2, "Python Basic", "Le Choyoen", 30000, 8));
        service.addBook(new Book(3, "AI Fullstack", "Ham Changhoon", 42000, 3));
        service.addBook(new Book(4, "Java 21", "Kim Daecheol", 34000, 4));

        System.out.println("=== 전체 도서 목록 ===");
        service.sortByPrice();

        System.out.println("\n=== 제목에 'Java'가 포함된 도서 ===");
        service.searchByTitle("Java");

        System.out.println("\n=== 도서 삭제 후 목록 ===");
        service.removeBook(2);
        service.sortByPrice();
    }
}