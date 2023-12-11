package com.example.taxigame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
@FXML

    Taxi controlTaxi = new Taxi();
    Button button = new Button();
    public void turnUp(KeyEvent e){
        if(e.getCode() == KeyCode.E){
            System.out.println("Is working");
            controlTaxi.turnUp();
        }
    }
    public void turnDown(KeyEvent e){
        if(e.getCode() == KeyCode.DOWN){
            controlTaxi.turnDown();
        }
    }
    public void turnLeft(KeyEvent e){
        if(e.getCode() == KeyCode.LEFT){
        controlTaxi.turnLeft();
        }
    }
    public void turnRight(KeyEvent e){
        if(e.getCode() == KeyCode.RIGHT){
            controlTaxi.turnRight();
        }
    }
    public Taxi getTaxi(){
        return this.controlTaxi;
    }
    public Button getButton(){
        return this.button;
    }
}