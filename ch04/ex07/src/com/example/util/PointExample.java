package com.example.util;

public class PointExample {

    record Point(int x, int y) {}

    public static void main(String[] args) {
        Object obj = new Point(3, 4);

        // ① Record 패턴 매칭
        if (obj instanceof Point(int x, int y)) {
            System.out.printf("x=%d, y=%d%n", x, y);
        }

        // ② switch 패턴 매칭
        String desc = switch (obj) {
            case Point(int x, int y) -> "Point(" + x + "," + y + ")";
            default -> "Not a point";
        };

        System.out.println(desc);
    }
}