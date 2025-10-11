package com.example.app;
public final class Triangle extends Shape {
    private final Point a, b, c;
    public Triangle(Point a, Point b, Point c) {
        super(a); // position은 임의로 첫 점 선택(또는 centroid)
        if (areCollinear(a,b,c)) throw new IllegalArgumentException("세 점이 일직선입니다.");
        this.a = a; this.b = b; this.c = c;
    }
    // shoelace formula
    @Override public double area() {
        return Math.abs((a.x()*(b.y()-c.y()) + b.x()*(c.y()-a.y()) + c.x()*(a.y()-b.y())))/2.0;
    }
    @Override public double perimeter() { return distance(a,b)+distance(b,c)+distance(c,a); }
    private static double distance(Point p1, Point p2) { /* ... */ return Math.hypot(p1.x()-p2.x(), p1.y()-p2.y()); }
    private static boolean areCollinear(Point a, Point b, Point c) { return areaOf(a,b,c)==0; }
    private static double areaOf(Point a, Point b, Point c) { return (a.x()*(b.y()-c.y()) + b.x()*(c.y()-a.y()) + c.x()*(a.y()-b.y()))/2.0; }
}