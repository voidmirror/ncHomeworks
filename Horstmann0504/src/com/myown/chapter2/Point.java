package com.myown.chapter2;

public final class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Point scale(double value) {
        x *= value;
        y *= value;
        return this;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
