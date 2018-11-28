package com.soft1841.oop.week2;

public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getArea() {
        return super.x * super.y;
    }
}
