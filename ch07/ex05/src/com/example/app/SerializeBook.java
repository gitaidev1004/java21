package com.example.app;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeBook {
    public static void main(String[] args) {
        Book book = new Book("한권으로 끝내는 Java 21 프로그래밍", "김기태");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"))) {
            oos.writeObject(book);
            System.out.println("객체가 book.dat 파일로 직렬화되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}