package com.soft1841.oop.week2;

public class Cube extends Rectangle {
    private double hieght;

    public Cube() {
    }

    public Cube(double x, double y, double hieght) {
        super(x, y);
        this.hieght = hieght;
    }

    public double getVolume() {
        return super.getArea() * this.hieght;
    }
}
