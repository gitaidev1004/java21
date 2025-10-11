package com.example.app;

import java.util.*;

public class ShapeApp {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(new Point(0,0), 1.0),
                new Rectangle(new Point(0,0), 2.0, 3.0),
                ShapeFactory.circle(5,5,0.5)
        );

        shapes.stream()
                .sorted(Comparator.comparingDouble(Shape::area))
                .forEach(s -> System.out.println(s + ", perimeter=" + s.perimeter()));

        // 패턴 매칭 예 (Java 21)
        for (Shape s : shapes) {
            if (s instanceof Circle c) System.out.println("Circle radius=" + c.radius());
            String desc = switch (s) {
                case Circle c -> "C:" + c.radius();
                case Rectangle r -> "R:" + r.width()+"x"+r.height();
                case Triangle t -> "T area=" + t.area();
                default -> "Unknown";
            };
            System.out.println(desc);
        }
    }
}