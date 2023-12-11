package com.example.taxigame;

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
    Vector velocity = new Vector();
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
        velocity.set(0, 0);
    }
    public void go(){
        if(rotation == 0){
            velocity.set(-5, 0);
        }
        if(rotation == 90){
            velocity.set(0, -5);
        }
        if(rotation == 180){
            velocity.set(5, 0);
        }
        if(rotation == 270){
            velocity.set(0, 5);
        }
    }
}
