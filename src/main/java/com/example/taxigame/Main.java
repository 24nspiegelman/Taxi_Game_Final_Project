package com.example.taxigame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
        public void start(Stage stage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Tutorial.fxml"));
            Scene scene = new Scene(root, 400, 400);
            scene.get
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}