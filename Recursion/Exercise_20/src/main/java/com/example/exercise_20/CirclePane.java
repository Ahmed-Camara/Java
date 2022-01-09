package com.example.exercise_20;

import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends StackPane {

    private int radius;
    public CirclePane(int numCircles,int radius){
        this.radius = radius;

        drawCircles(numCircles,radius);
        setPadding(new Insets(radius));
    }

    public void drawCircles(int numCircles,int radius){
        if(numCircles == 0)
            return;

        System.out.println(numCircles);
        Circle circle = new Circle(radius);

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        this.getChildren().add(circle);

        drawCircles(numCircles-1,this.radius+radius);
    }
}
