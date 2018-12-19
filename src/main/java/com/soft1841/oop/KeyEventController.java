package com.soft1841.oop;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class KeyEventController implements Initializable {
    @FXML
    private Button btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //给按钮一个随机起始位置，用随机数生成其横纵坐标
        Random random = new Random();
        int startX = random.nextInt(400);
        int startY = random.nextInt(300);
        AnchorPane.setLeftAnchor(btn, (double) startX);
        AnchorPane.setTopAnchor(btn, (double) startY);
    }

    public void moveBtn(KeyEvent event) {
        //获取按钮当前位置
        double x = btn.getLayoutX();
        double y = btn.getLayoutY();
        System.out.println("当前坐标：" + x + "," + y);
        //获取键码
        KeyCode keyCode = event.getCode();
        //向右键，每按一次横坐标加1，实现向右移动的效果
        if (keyCode == KeyCode.RIGHT) {
            x = x + 1;
            AnchorPane.setLeftAnchor(btn, x);
        }
        //向左键，每按一次横坐标减1，实现向左移动的效果
        if (keyCode == KeyCode.LEFT) {
            x = x - 1;
            AnchorPane.setLeftAnchor(btn, x);
        }

        //向下键，每按一次纵坐标加1，实现向下移动的效果
        if (keyCode == KeyCode.DOWN) {
            y = y + 1;
            AnchorPane.setTopAnchor(btn, y);
        }
        //向上键，每按一次纵坐标减1，实现向上移动的效果
        if (keyCode == KeyCode.UP) {
            y = y - 1;
            AnchorPane.setTopAnchor(btn, y);
        }
        //判断按钮是否移动到指定点
        System.out.println("目的地坐标：150,100");
        if (x == 150.0 && y == 100.0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("提示");
            alert.setContentText("success");
            alert.showAndWait();
        }

        //按下ctrl+enter组合键，直接让按钮到达目标位置
        final KeyCombination keyCodeCombination = new KeyCodeCombination(KeyCode.ENTER, KeyCombination.CONTROL_DOWN);
        if (keyCodeCombination.match(event)) {
            AnchorPane.setLeftAnchor(btn, 150.0);
            AnchorPane.setTopAnchor(btn, 100.0);
        }
    }
}