package com.soft1841.oop.week1;

import javafx.scene.control.Button;

/**
 * 自定义按钮
 */

public class MyButton extends Button {
    //自定义构造方法，实现一个指定宽高和背景色的按钮
    public MyButton() {
        //给当前按钮对象设置合适尺寸
        this.setPrefSize(100,30);
        this.setStyle("-fx-background-color: #59a3ff");
    }
}
