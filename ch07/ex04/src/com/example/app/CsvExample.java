package com.example.app;
import java.io.*;
import java.util.*;

public class CsvExample {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            br.lines().forEach(line -> {
                String[] cols = line.split(",");
                System.out.println(Arrays.toString(cols));
            });
        }
    }
}