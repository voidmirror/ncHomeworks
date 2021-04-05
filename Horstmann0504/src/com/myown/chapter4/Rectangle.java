package com.myown.chapter4;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft.getX(), topLeft.getY());
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(getX() + 0.5 * width, getY() + 0.5 * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void clone(Rectangle rectangle) {
        this.setX(rectangle.getX());
        this.setY(rectangle.getY());
        this.setWidth(rectangle.getWidth());
        this.setHeight(rectangle.getHeight());
    }
}
