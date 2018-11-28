package com.soft1841.oop.week1.areatest;

public class Rectangle extends Shape {
    @Override
    public void getArea() {
        super.getArea();
        int width = 10;
        int height = 20;
        System.out.println(width*height);
    }
}
