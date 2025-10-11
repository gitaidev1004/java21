package com.example.app;
import java.io.*;

public class TextFileExample {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
            bw.write("Hello Java IO");
        }
        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
            System.out.println(br.readLine());
        }
    }
}