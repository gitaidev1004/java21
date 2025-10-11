package com.example.app;

public final class ShapeFactory {
    public static Circle circle(double x, double y, double r) { return new Circle(new Point(x,y), r); }
    public static Rectangle rectangle(double x, double y, double w, double h) { return new Rectangle(new Point(x,y), w,h); }
}
