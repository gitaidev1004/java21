package com.example.dto;
public record PointExample(int x, int y) {
    public double distance() {
        return Math.hypot(x, y);
    }
    public static PointExample origin() { return new PointExample(0,0); }
}