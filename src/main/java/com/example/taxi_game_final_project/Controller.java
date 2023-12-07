package com.example.taxi_game_final_project;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;

public class Controller {
@FXML

    Taxi controlTaxi = new Taxi();
    public void turnUp(KeyEvent e){
        controlTaxi.turnUp();
    }
    public void turnDown(KeyEvent e){
        controlTaxi.turnDown();
    }
    public void turnLeft(KeyEvent e){
        controlTaxi.turnLeft();
    }
    public void turnRight(KeyEvent e){
        controlTaxi.turnRight();
    }

}