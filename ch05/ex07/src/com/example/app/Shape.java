package com.example.app;
public abstract class Shape {
    private final Point position;

    protected Shape(Point position) {
        this.position = position == null ? new Point(0,0) : position;
    }

    public Point position() { return position; }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return String.format("%s@%s area=%.4f", this.getClass().getSimpleName(), position, area());
    }
}