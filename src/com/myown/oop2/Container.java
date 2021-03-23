package com.myown.oop2;

public class Container {
    double x1, y1, x2, y2;

    public Container(double x1, double y1, double width, double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 - height;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getWidth() {
        return x2 - x1;
    }

    public double getHeight() {
        return y1 - y2;
    }

    public boolean collidesWidth(Ball ball) {
        if ((ball.getX() >= x1 + ball.getRadius() && ball.getX() <= x2 - ball.getRadius()) && (ball.getY() >= y2 + ball.getRadius() && ball.getY() <= y1 - ball.getRadius())) {
            return true;
        } else {
            return false;
        }
    }
}
