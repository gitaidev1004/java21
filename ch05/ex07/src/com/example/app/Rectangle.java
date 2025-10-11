package com.example.app;
public final class Rectangle extends Shape {
    private final double width, height;
    public Rectangle(Point pos, double width, double height) {
        super(pos);
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("width/height > 0");
        this.width = width; this.height = height;
    }
    public double width() { return width; }
    public double height() { return height; }
    @Override public double area() { return width * height; }
    @Override public double perimeter() { return 2*(width+height); }
}