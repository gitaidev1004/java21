package com.example.app;
import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        }
    }
}