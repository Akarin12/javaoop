package com.soft1841.oop.book;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class BookApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/book_main.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        BorderPane root = fxmlLoader.load();
        Scene scene = new Scene(root,1250,700);
        primaryStage.setTitle("图书主界面");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
