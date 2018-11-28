package com.soft1841.oop.uplay;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class UplayController implements Initializable {

    @FXML
    private UBtn menu1;

    @FXML
    private UBtn cart;

    @FXML
    private UBtn key;

    @FXML
    private UBtn message;

    @FXML
    private UBtn friends;

    @FXML
    private UBtnL menu2;

    @FXML
    private UBtnL menu3;

    @FXML
    private UBtnL menu4;

    @FXML
    private UBtnL installed;

    @FXML
    private  UBtnL mygame;

    @FXML
    private UBtnL free;

    @FXML
    private FlowPane show;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image btnImg1 = new Image("/img/uplay/menu.png");
        ImageView imageView1 = new ImageView(btnImg1);
        imageView1.setFitWidth(30);
        imageView1.setFitHeight(30);
        menu1.setGraphic(imageView1);

        Image btnImg2 = new Image("/img/uplay/cart.png");
        ImageView imageView2 = new ImageView(btnImg2);
        imageView2.setFitWidth(23);
        imageView2.setFitHeight(23);
        cart.setGraphic(imageView2);

        Image btnImg5 = new Image("/img/uplay/key.png");
        ImageView imageView5 = new ImageView(btnImg5);
        imageView5.setFitWidth(23);
        imageView5.setFitHeight(23);
        key.setGraphic(imageView5);

        Image btnImg3 = new Image("/img/uplay/message.png");
        ImageView imageView3 = new ImageView(btnImg3);
        imageView3.setFitWidth(23);
        imageView3.setFitHeight(23);
        message.setGraphic(imageView3);

        Image btnImg4 = new Image("/img/uplay/friends.png");
        ImageView imageView4 = new ImageView(btnImg4);
        imageView4.setFitWidth(23);
        imageView4.setFitHeight(23);
        friends.setGraphic(imageView4);

        Image btnImg6 = new Image("/img/uplay/menu4.png");
        ImageView imageView6 = new ImageView(btnImg6);
        imageView6.setFitWidth(23);
        imageView6.setFitHeight(23);
        menu2.setGraphic(imageView6);

        Image btnImg7 = new Image("/img/uplay/munu3.png");
        ImageView imageView7 = new ImageView(btnImg7);
        imageView7.setFitWidth(23);
        imageView7.setFitHeight(23);
        menu3.setGraphic(imageView7);

        Image btnImg8 = new Image("/img/uplay/menu2.png");
        ImageView imageView8 = new ImageView(btnImg8);
        imageView8.setFitWidth(23);
        imageView8.setFitHeight(23);
        menu4.setGraphic(imageView8);

        Image btnImg9 = new Image("/img/uplay/right.png");
        ImageView imageView9 = new ImageView(btnImg9);
        imageView9.setFitWidth(23);
        imageView9.setFitHeight(23);
        installed.setGraphic(imageView9);

        Image btnImg10 = new Image("/img/uplay/right.png");
        ImageView imageView10 = new ImageView(btnImg10);
        imageView10.setFitWidth(23);
        imageView10.setFitHeight(23);
        mygame.setGraphic(imageView10);

        Image btnImg11 = new Image("/img/uplay/down.png");
        ImageView imageView11 = new ImageView(btnImg11);
        imageView11.setFitWidth(23);
        imageView11.setFitHeight(23);
        free.setGraphic(imageView11);

        GameCards[] gameCards = new GameCards[]{
                new GameCards("1.png","Tom Clancy's Ghost\nRecon Wildlands - Trial\nVersion"),
                new GameCards("2.png","Tom Clancy's The\nDivision - Trial Version"),
                new GameCards("3.png","UNO - Demo"),
                new GameCards("4.png","Champions of Anteria -\nDemo"),
                new GameCards("5.png","Trackmania Turbo Trial\nVersion"),
                new GameCards("6.png","The Crew™ Trial\nVersion"),
                new GameCards("7.png","Might & Magic Heros\nOnline"),
                new GameCards("8.png","Trials Fusion"),
                new GameCards("9.png","Child of Light Demo"),
                new GameCards("10.png","Rayman® Legends\nDemo"),
                new GameCards("11.png","ShootMania Storm\nElite Demo"),
                new GameCards("12.png","The Settlers Online"),
                new GameCards("13.png","Flashback™ Demo")
        };
        for (GameCards gamecard:gameCards) {
            BorderPane borderPane = new BorderPane();
            borderPane.setStyle("-fx-background-color: #161a1f");
            Image image = new Image("/img/uplay/"+ gamecard.getPicture());
            ImageView imageView = new ImageView(image);
            Label nameLabel = new Label(gamecard.getName());
            nameLabel.setStyle("-fx-font-size: 13px;-fx-text-fill: #c9c9c9");
            borderPane.setTop(imageView);
            borderPane.setCenter(nameLabel);
            show.getChildren().add(borderPane);
        }
    }

}
