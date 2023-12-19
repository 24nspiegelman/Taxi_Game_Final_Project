package com.example.taxigame;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.*;


public class Controller {
    @FXML
    private List<Circle> passengers= new ArrayList<>();
    @FXML
    Rectangle taxi = new Rectangle();
    @FXML
    Circle person = new Circle();
    @FXML
    Text score = new Text();

    @FXML
    Rectangle red = new Rectangle();
    @FXML
    Rectangle salmon = new Rectangle();
    @FXML
    Rectangle orange = new Rectangle();
    @FXML
    Rectangle lightOrange = new Rectangle();
    @FXML
    Rectangle yellow = new Rectangle();
    @FXML
    Rectangle lime = new Rectangle();
    @FXML
    Rectangle green = new Rectangle();
    @FXML
    Rectangle teal = new Rectangle();
    @FXML
    Rectangle aqua = new Rectangle();
    @FXML
    Rectangle lightBlue = new Rectangle();
    @FXML
    Rectangle blue = new Rectangle();
    @FXML
    Rectangle purple = new Rectangle();
    @FXML
    Rectangle magenta = new Rectangle();
    @FXML
    Rectangle pink = new Rectangle();
    @FXML
    Rectangle brown = new Rectangle();
    @FXML
    Rectangle black = new Rectangle();

    Rectangle[] locations = {red, salmon, orange, lightOrange, yellow, lime, green, teal, aqua, lightBlue, blue,
    purple, magenta, pink, brown, black};
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
        score.setText("0");
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
        System.out.println("Person: (" + person.getLayoutX() + ", " + person.getLayoutY() + ")");
        System.out.println("Taxi: (" + taxi.getX() + ", " + taxi.getY() + ")");

        if(taxi.getBoundsInParent().intersects(person.getBoundsInParent())){

            System.out.println("intersect");
            person.setFill(colors[(int)(Math.random()*16)]);
            passengers.add(0, person);
            root.getChildren().remove(person);
        }
    }

    public void dropOff(Pane root){
        System.out.println("Drop Off");
        Paint color = passengers.get(0).getFill();
        Circle p2 = new Circle();
        p2.setFill(color);
        p2.setLayoutX((int)(Math.random()*700+50));
        p2.setLayoutY((int)(Math.random()*700+50));
        p2.setRadius(17);
        p2.setStrokeWidth(3);
        p2.setStroke(Color.BLACK);
        person = p2;
        root.getChildren().add(person);

        for(Rectangle r: locations){
            if(r.getFill().equals(person.getFill())){
                score.setText(String.valueOf(Integer.parseInt(score.getText())+1));
            }
        }
    }

    public void newPassenger(Pane root){
        System.out.println("new passenger");
        Circle newCircle = new Circle();
        int colorNum = (int) (Math.random()*16);
        newCircle.setFill(colors[colorNum]);
        System.out.println(colors[colorNum]);
        newCircle.setLayoutX((int)(Math.random()*700+50));
        newCircle.setLayoutY((int)(Math.random()*700+50));
        root.getChildren().add(newCircle);
    }
}