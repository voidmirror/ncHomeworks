package com.myown.chapter4;

public class Line extends Shape {
    private Point dest;

    public Line(Point from, Point to) {
        super(from.getX(), from.getY());
        dest.setX(to.getX());
        dest.setY(to.getY());
    }

    public Point getDest() {
        return dest;
    }

    public void setDest(Point dest) {
        this.dest = dest;
    }

    @Override
    public Point getCenter() {
        return new Point((getX() + dest.getX()) / 2, (getY() + dest.getY()) / 2);
    }

    public void clone(Line line) {
        this.setX(line.getX());
        this.setX(line.getY());
        dest.setX(line.getDest().getX());
        dest.setY(line.getDest().getY());
    }
}
