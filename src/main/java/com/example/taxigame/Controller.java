package com.example.taxigame;

import javafx.fxml.FXML;

import javafx.scene.shape.Rectangle;

public class Controller {
@FXML
    Rectangle taxi = new Rectangle();
//    public void turnUp(Taxi taxi){
//        controlTaxi.turnUp();
//        System.out.println("UP");
//    }
//    public void turnDown(Taxi taxi){
//        controlTaxi.turnDown();
//        System.out.println("DOWN");
//    }
//    public void turnLeft(Taxi taxi){
//        controlTaxi.turnLeft();
//        System.out.println("LEFT");
//    }
//    public void turnRight(Taxi taxi){
//        controlTaxi.turnRight();
//        System.out.println("RIGHT");
//    }
//    private final int xVelocity = 5;
//    private final int yVelocity = 5;

    boolean moving = false;

    public void taxiStart(){
        taxi.setX(306);
        taxi.setY(419);
        go();
        move();
    }
//    Vector velocity = new Vector();
    public void turnLeft(){
        taxi.setRotate(0);
    }
    public void turnUp(){
        taxi.setRotate(90);
    }
    public void turnRight(){
        taxi.setRotate(180);
    }
    public void turnDown(){
        taxi.setRotate(270);
    }
    public void stop(){
        moving = false;
    }
    public void go(){
        moving = true;
    }
    public void move(){
        while(moving){
            if(taxi.getRotate() == 0){
                taxi.setX(taxi.getX() + 50);
            }
            else if(taxi.getRotate() == 90){
                taxi.setY(taxi.getY() - 50);
            }
            else if(taxi.getRotate() == 180){
                taxi.setX(taxi.getX() - 50);
            }
            else if(taxi.getRotate() == 270){
                taxi.setY(taxi.getY() + 50);
            }
        }
    }

}