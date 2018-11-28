package com.soft1841.oop.week2.fly;

public abstract class FlyObject implements Fly {
    //飞行物名称
    protected String name;
    //飞行时速
    protected double speed;
    //构造方法

    public FlyObject(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
}
