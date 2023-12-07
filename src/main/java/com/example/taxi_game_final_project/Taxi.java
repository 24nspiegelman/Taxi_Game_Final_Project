package com.example.taxi_game_final_project;

public class Taxi {
    private int xVelocity = 5;
    private int yVelocity = 5;
    private int xPos;
    private int yPos;
    private int rotation;


    Taxi(){
        this.xPos = 306;
        this.yPos = 419;
        this.rotation = 180;
    }
    public void turnLeft(){
        rotation = 0;
    }
    public void turnUp(){
        rotation = 90;
    }
    public void turnRight(){
        rotation = 180;
    }
    public void turnDown(){
        rotation = 270;
    }
    public void stop(){
        if(xVelocity != 0){
            xVelocity = 0;
        }
        if(yVelocity !=0){
            yVelocity = 0;
        }
    }
    public void go(){
        if(rotation == 0){
            xVelocity = -5;
        }
        if(rotation == 90){
            yVelocity = -5;
        }
        if(rotation == 180){
            xVelocity = 5;
        }
        if(rotation == 270){
            yVelocity = 5;
        }
    }
}
