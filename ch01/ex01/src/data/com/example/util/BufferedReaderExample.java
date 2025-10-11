package com.example.util;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
            System.out.print("숫자 입력: ");
            String line = br.readLine();
            int n = Integer.parseInt(line.trim());
            System.out.println("입력한 숫자: " + n);
        }
    }
}