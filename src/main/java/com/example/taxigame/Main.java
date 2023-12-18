package com.example.taxigame;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
        public void start(Stage stage) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            Parent root = loader.load();
            Controller controller = loader.getController();
            controller.gameStart();
            Scene scene = new Scene(root, 800, 800);
            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    System.out.println(event.getCode());
                    switch(event.getCode()) {
                        case UP:
                            controller.moveUp();
                            break;
                        case LEFT:
                            controller.moveLeft();
                            break;
                        case DOWN:
                            controller.moveDown();
                            break;
                        case RIGHT:
                            controller.moveRight();
                            break;
                        default:
                            System.out.println(event.getCode());
                            break;
                    }
                }
            });
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}