package com.example.app;
import java.io.Serializable;

// serialVersionUID가 다른 경우
public class Book2 implements Serializable {
    private static final long serialVersionUID = 2L; // 변경됨
    private String title;
    private String author;
}