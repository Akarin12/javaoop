package com.soft1841.oop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class MoveSampleApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 1800, 900);
        Circle circle = new Circle(200, 150, 50, Color.BLUEVIOLET);
        borderPane.getChildren().add(circle);
        primaryStage.setTitle("动啊");
        primaryStage.setScene(scene);
        primaryStage.show();

        scene.setOnKeyPressed(e -> {
            KeyCode code = e.getCode();

            double xx = circle.getCenterX();
            double yy = circle.getCenterY();

            if (code.equals(KeyCode.LEFT)) {
                circle.setCenterX(circle.getCenterX() - 10);
            } else if (code.equals(KeyCode.RIGHT)) {
                circle.setCenterX(circle.getCenterX() + 10);
            } else if (code.equals(KeyCode.UP)) {
                circle.setCenterY(circle.getCenterY() - 10);
            } else if (code.equals(KeyCode.DOWN)) {
                circle.setCenterY(circle.getCenterY() + 10);
            } else if (code.equals(KeyCode.SPACE)) {
                Label labelP = new Label(xx + " " + yy);
                labelP.setStyle("-fx-font-size: 40px");
                borderPane.setTop(labelP);
            }

            if (yy == 290.0) {
                if (xx == 900.0) {
                    Label labelY = new Label("YEA!!!");
                    labelY.setStyle("-fx-font-size: 200px;"+"-fx-text-fill: #ff0300");
                    borderPane.setCenter(labelY);
                }
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}
