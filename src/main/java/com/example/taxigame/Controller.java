package com.example.taxigame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Ellipse;

public class Controller {
@FXML
    private Taxi controlTaxi;
    public void turnUp(){
//        controlTaxi.turnUp();
        System.out.println("UP");
    }
    public void turnDown(){
//        controlTaxi.turnDown();
        System.out.println("DOWN");
    }
    public void turnLeft(){
//        controlTaxi.turnLeft();
        System.out.println("LEFT");
    }
    public void turnRight(){
//        controlTaxi.turnRight();
        System.out.println("RIGHT");
    }

}