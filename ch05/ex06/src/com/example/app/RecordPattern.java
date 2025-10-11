package com.example.app;

public class RecordPattern {
    public static void main(String[] args){
        record Point(int x, int y) {}
        Object o = new Point(1,2);
        String desc = switch (o) {
            case Point(int x, int y) -> "Point(" + x + "," + y + ")";
            case String s -> "String: " + s;
            default -> "Other";
        };
    }
}
