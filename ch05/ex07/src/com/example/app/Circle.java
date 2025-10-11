package com.example.app;
public final class Circle extends Shape implements Transformable<Circle>, Drawable {
    private final double radius;
    public Circle(Point pos, double radius) {
        super(pos);
        if (radius <= 0) throw new IllegalArgumentException("radius > 0");
        this.radius = radius;
    }
    public double radius() { return radius; }
    @Override public double area() { return Math.PI * radius * radius; }
    @Override public double perimeter() { return 2 * Math.PI * radius; }
    @Override public Circle translate(double dx, double dy) {
        return new Circle(new Point(position().x()+dx, position().y()+dy), radius);
    }
    @Override public Circle scale(double factor) {
        if (factor <= 0) throw new IllegalArgumentException("scale>0");
        return new Circle(position(), radius * factor);
    }
    @Override public void draw() { System.out.println(this); }
}