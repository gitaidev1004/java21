package com.example.app;
public record Point(double x, double y) {
    public Point {
        if (Double.isNaN(x) || Double.isNaN(y)) throw new IllegalArgumentException("좌표는 유효한 숫자여야 합니다.");
    }
}