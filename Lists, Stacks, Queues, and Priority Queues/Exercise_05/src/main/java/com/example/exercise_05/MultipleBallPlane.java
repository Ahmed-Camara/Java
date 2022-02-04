package com.example.exercise_05;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class MultipleBallPlane extends Pane {
    private Timeline animation = null;
    public MultipleBallPlane(){
        animation = new Timeline(new KeyFrame(Duration.millis(50),e->moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void add(){
        Color color = new Color(Math.random(),Math.random(),Math.random(),0.5);
        getChildren().add(new Ball(30,30,20,color));
    }
    public void substract(){
        if(getChildren().size() > 0){
            getChildren().remove(getChildren().size() - 1);
        }
    }
    public void suspend(){
        animation.pause();
    }
    public void resume(){
        animation.play();
    }
    public DoubleProperty rateProperty(){
        return animation.rateProperty();
    }
    private void moveBall(){

        for(int i = 0; i < this.getChildren().size(); i++){
            Ball ball = (Ball) this.getChildren().get(i);

            if(ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth()-ball.getRadius()){
                ball.dx *= -1;
            }
            if(ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()){
                ball.dy *= -1;
            }

            ball.setCenterX(ball.dx + ball.getCenterX());
            ball.setCenterY(ball.dy + ball.getCenterY());


            for (int j = i; j < this.getChildren().size(); j++){
                if(this.getChildren().size() > 1){
                    Ball ball2 = (Ball) this.getChildren().get(j);

                    if(ball.getBoundsInParent().intersects(ball2.getBoundsInParent())){
                        System.out.println("Collision");
                    }
                }else{
                    break;
                }
            }
        }
    }

    private void detectCollision(){

    }

    class Ball extends Circle{
        private double dx=1,dy=1;
        public Ball(double x, double y, double radius, Color color){
            super(x,y,radius);
            setFill(color);
        }
    }
}
