package com.example.app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("오늘 날짜: " + today.format(DateTimeFormatter.ISO_DATE));
        System.out.println("다음 주 날짜: " + nextWeek.format(DateTimeFormatter.ISO_DATE));
    }
}