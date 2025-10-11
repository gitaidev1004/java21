package com.example.util;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String secret = new String(console.readPassword("비밀번호: "));
            System.out.println("입력된 길이: " + secret.length());
        } else {
            System.out.println("콘솔을 사용할 수 없습니다 (IDE 환경일 수 있음).");
        }
    }
}