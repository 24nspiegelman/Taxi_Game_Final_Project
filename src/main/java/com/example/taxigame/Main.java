package com.example.taxigame;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
        public void start(Stage stage) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            Parent root = loader.load();
            Controller controller = loader.getController();
//            controller.taxiStart();
            Scene scene = new Scene(root, 400, 400);
            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    System.out.println(event.getCode());
                    switch(event.getCode()) {

                        case UP:
                            controller.turnUp();
                            break;

                        case LEFT:
                            controller.turnLeft();
                            break;

                        case DOWN:
                            controller.turnDown();
                            break;

                        case RIGHT:
                            controller.turnRight();
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