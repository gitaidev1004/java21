package com.example.app;
import java.io.*;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("data.txt");
        } catch (IOException e) {
            System.out.println("입출력 오류 발생");
        } finally {
            if (reader != null) {
                try { reader.close(); } catch (IOException e) {}
            }
        }
    }
}