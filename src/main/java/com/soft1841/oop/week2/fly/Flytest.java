package com.soft1841.oop.week2.fly;

public class Flytest {
    public static void main(String[] args) {
        //通过接口回调，创建一个Plane的实例给接口变量
        Fly fly1 = new Plane("歼16", 2817.6);
        //调用fly()方法，输出飞机的飞行信息
        System.out.println(fly1.fly());

        //通过接口回调，创建一个Bird的实例给接口变量
        Fly fly2 = new Bird("寒鸦", 56.7);
        //调用fly()方法，输出飞禽的飞行信息
        System.out.println(fly2.fly());
    }
}
