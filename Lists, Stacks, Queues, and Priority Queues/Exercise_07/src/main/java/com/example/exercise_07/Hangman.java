package com.example.exercise_07;

import javafx.animation.PathTransition;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import java.util.ArrayList;

public class Hangman extends Pane {
    private static final double WIDTH = 600.0;
    private static final double HEIGTH = 500.0;
    private Line hook;
    private Circle head;
    private Line leftharm;
    private Line rightarm;
    private Line body;
    private Line leftLeg;
    private Line rigthLeg;
    private PathTransition path;
    private Shape[] bodies;

    private Label word;
    private Label status;
    private String [] words = {"white","flower","jello"};
    private String w;
    private int miss = 0;
    private ArrayList<Character> missLetter = new ArrayList<>();
    private ArrayList<Character> correctLetter = new ArrayList<>();
    private boolean playing;

    public Hangman(){
        drawGUI();
    }

    private void drawGUI(){

        setPrefSize(WIDTH,HEIGTH);
        drawPlatform();
        drawPerson();
    }

    private void drawPlatform(){
        Arc bottom = new Arc(WIDTH/2,HEIGTH-20,WIDTH/10,HEIGTH/15,0,180);
        bottom.setFill(Color.WHITE);
        bottom.setStroke(Color.BLACK);
        Line post =
                new Line(bottom.getCenterX(), bottom.getCenterY() - bottom.getRadiusY(),
                        bottom.getCenterX(), HEIGTH / 15);

        Line top = new Line(post.getEndX(), post.getEndY(),
                post.getEndX() + WIDTH / 3.5, post.getEndY());

        hook = new Line(top.getEndX(), top.getEndY(),
                top.getEndX(), top.getEndY() + HEIGTH / 20);

        getChildren().addAll(bottom, post, top, hook);
    }
    private void drawPerson(){
        head = new Circle(hook.getEndX(),hook.getEndY() + HEIGTH / 15,HEIGTH / 15);
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);
        getChildren().addAll(head);
    }
}
