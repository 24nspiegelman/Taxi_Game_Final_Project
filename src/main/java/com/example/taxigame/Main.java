package com.example.taxigame;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
        public void start(Stage stage) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
            Pane root = loader.load();
            Controller controller = loader.getController();
            controller.gameStart();
            Scene scene = new Scene(root, 800, 800);
            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    System.out.println(event.getCode());
                    switch(event.getCode()) {
                        case UP:
                            controller.moveUp(root);
//                            if(controller.pickUp()){
//                                root.getChildren().remove(controller.person);
//                            }
                            controller.pickUp(root);
                            break;
                        case LEFT:
                            controller.moveLeft(root);
//                            if(controller.pickUp()){
//                                root.getChildren().remove(controller.person);
//                            }
                            controller.pickUp(root);
                            break;
                        case DOWN:
                            controller.moveDown(root);
//                            if(controller.pickUp()){
//                                root.getChildren().remove(controller.person);
//                            }
                            controller.pickUp(root);
                            break;
                        case RIGHT:
                            controller.moveRight(root);
//                            if(controller.pickUp()){
//                                root.getChildren().remove(controller.person);
//                            }
                            controller.pickUp(root);
                            break;
                        case ENTER:
                            controller.dropOff(root);
                            controller.newPassenger(root);
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