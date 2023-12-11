package com.example.taxigame;

public class Vector {

    private int x;
    private int y;

    Vector(){
        this.x = 0;
        this.y = 0;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
