package com.example.taxigame;

import javafx.fxml.FXML;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Controller {
@FXML
    Rectangle taxi = new Rectangle();

    Circle person = new Circle(4);


    Color[] colors = {Color.web("fc2b2b"), Color.web("ff8280"), Color.web("f77000"), Color.web("ffcc6e"),
            Color.web("fffd21"), Color.web("9dff00"),Color.web("20ab13"), Color.web("1fffb1"),
            Color.web("1ff7ff"), Color.web( "1fa1ff"), Color.web("1f3bff"), Color.web("7a1fff"),
            Color.web("c71fff"), Color.web("ff1fe1"), Color.web("7c6b50"), Color.web("515050")};





    public void gameStart(){
        System.out.println(taxi.getX());
        System.out.println(taxi.getY());
        person.setFill(Paint.valueOf());
//        go();
//        move();
    }
//    Vector velocity = new Vector();
    public void turnLeft() {
        taxi.setRotate(0);
        taxi.setX(taxi.getX() - 50);
    }

    public void turnUp(){
        taxi.setRotate(90);
        taxi.setY(taxi.getY() - 50);
    }
    public void turnRight(){
        taxi.setRotate(180);
        taxi.setX(taxi.getX() + 50);
    }
    public void turnDown(){
        taxi.setRotate(270);
        taxi.setY(taxi.getY() + 50);
    }

//    public void move(){
////        while(moving){
//            if(taxi.getRotate() == 0){
//                taxi.setX(taxi.getX() + 50);
//            }
//            else if(taxi.getRotate() == 90){
//                taxi.setY(taxi.getY() - 50);
//            }
//            else if(taxi.getRotate() == 180){
//                taxi.setX(taxi.getX() - 50);
//            }
//            else if(taxi.getRotate() == 270){
//                taxi.setY(taxi.getY() + 50);
//            }
//        }
    }