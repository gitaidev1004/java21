package com.example.app;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeBook {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"))) {
            Book book = (Book) ois.readObject();
            System.out.println("복원된 객체: " + book);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}