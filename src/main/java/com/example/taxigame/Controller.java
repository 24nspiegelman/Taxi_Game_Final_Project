package com.example.taxigame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Controller {
    private Queue<Circle> passengers= new LinkedList<>() {
        @Override
        public boolean add(Circle circle) {
            return false;
        }

        @Override
        public boolean offer(Circle circle) {
            return false;
        }

        @Override
        public Circle remove() {
            return null;
        }

        @Override
        public Circle poll() {
            return null;
        }

        @Override
        public Circle element() {
            return null;
        }

        @Override
        public Circle peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Circle> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Circle> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
    @FXML
    Rectangle taxi = new Rectangle();
    @FXML
    Circle person = new Circle();
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
    public void moveLeft(Pane root) {
        taxi.setRotate(0);
        taxi.setX(taxi.getX() - 20);
        pickUp(root);
    }
    public void moveUp(Pane root){
        taxi.setRotate(90);
        taxi.setY(taxi.getY() - 20);
        pickUp(root);
    }
    public void moveRight(Pane root){
        taxi.setRotate(180);
        taxi.setX(taxi.getX() + 20);
        pickUp(root);
    }
    public void moveDown(Pane root){
        taxi.setRotate(270);
        taxi.setY(taxi.getY() + 20);
        pickUp(root);
    }

    public void pickUp(Pane root){
        System.out.println("Person: (" + person.getLayoutX() + ", " + person.getLayoutY());
        System.out.println("Taxi: (" + taxi.getX() + ", " + taxi.getY());

        if(taxi.getBoundsInParent().intersects(person.getBoundsInParent())){

            System.out.println("intersect");
            person.setFill(colors[(int)(Math.random()*16)]);
            passengers.offer(person);
            root.getChildren().remove(person);
        }
        System.out.println(passengers.contains(person));
    }
}