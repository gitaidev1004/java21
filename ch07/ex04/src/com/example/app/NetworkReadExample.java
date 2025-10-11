package com.example.app;
import java.io.*;
import java.net.*;

public class NetworkReadExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.w3.org/robots.txt");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openStream()))) {
            br.lines().forEach(System.out::println);
        }
    }
}