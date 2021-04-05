package com.myown.chapter4;

public class Circle extends Shape {
    private double radius = 0.0;

    public Circle(Point point, double radius) {
        super(point.getX(), point.getY());
    }

    @Override
    public Point getCenter() {
        return new Point(getX(), getY());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void clone(Circle circle) {
        this.setX(circle.getX());
        this.setY(circle.getY());
        this.setRadius(circle.getRadius());
    }
}
