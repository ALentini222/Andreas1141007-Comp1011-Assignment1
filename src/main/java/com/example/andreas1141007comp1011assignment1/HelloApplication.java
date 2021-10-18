package com.example.andreas1141007comp1011assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.getIcons().add(new Image("File:Circle-icons-gamecontroller.svg"));
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-review.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Game Graph");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


//image icon from https://commons.wikimedia.org/wiki/File:Circle-icons-gamecontroller.svg