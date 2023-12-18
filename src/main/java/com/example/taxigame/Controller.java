package com.example.taxigame;

import javafx.fxml.FXML;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Controller {
@FXML
    Rectangle taxi = new Rectangle();

    @FXML
    Circle person = new Circle();


    String[] colorCodes = {"#fc2b2b", "#ff8280", "#f77000", "#ffcc6e", "#fffd21", "#9dff00", "#20ab13", "#1fffb1",
            "1ff7ff", "#1fa1ff", "#1f3bff", "#7a1fff", "#c71fff", "#ff1fe1", "#7c6b50", "#515050"};
    Color[] colors = {Color.web("#fc2b2b"), Color.web("#ff8280"), Color.web("#f77000"), Color.web("#ffcc6e"),
            Color.web("#fffd21"), Color.web("#9dff00"),Color.web("#20ab13"), Color.web("#1fffb1"),
            Color.web("#1ff7ff"), Color.web( "#1ff7ff"), Color.web("#1f3bff"), Color.web("#7a1fff"),
            Color.web("#c71fff"), Color.web("#ff1fe1"), Color.web("#7c6b50"), Color.web("#515050")};





    public void gameStart(){
        System.out.println("Started");
        int colorNum = (int) (Math.random()*16);
        person.setFill(colors[colorNum]);
        System.out.println(colors[colorNum]);
        person.setLayoutX((int)(Math.random()*700+50));
        person.setLayoutY((int)(Math.random()*700+50));
    }
    public void moveLeft() {
        taxi.setRotate(0);
        taxi.setX(taxi.getX() - 20);
    }

    public void moveUp(){
        taxi.setRotate(90);
        taxi.setY(taxi.getY() - 20);
    }
    public void moveRight(){
        taxi.setRotate(180);
        taxi.setX(taxi.getX() + 20);
    }
    public void moveDown(){
        taxi.setRotate(270);
        taxi.setY(taxi.getY() + 20);
    }
}