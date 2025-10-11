package com.example.app;
public interface Transformable<T extends Shape> {
    T translate(double dx, double dy);
    T scale(double factor);
}