package com.example.exercise_09;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.util.*;

public class MultipleBallPlane extends Pane {
    private Timeline animation = null;
    private PriorityQueue<Ball> pq = null;
    public MultipleBallPlane(){
        pq = new PriorityQueue<>(6, new Comparator<Ball>() {
            @Override
            public int compare(Ball o1, Ball o2) {
                if (o1.getRadius() > o2.getRadius())
                    return -1;
                else if(o1.getRadius() < o2.getRadius())
                    return 1;
                else
                    return 0;
            }
        });
        animation = new Timeline(new KeyFrame(Duration.millis(50), e->moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void add(){
        Color color = new Color(Math.random(),Math.random(),Math.random(),0.5);
        int radius = (int) (Math.random() * 20) + 2;
        Ball ball = new Ball(30,30,radius,color);
        getChildren().add(ball);
        pq.offer(ball);
    }
    public void substract(){
        if(getChildren().size() > 0){
            getChildren().remove(pq.poll());
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
            ArrayList<Node> list = new ArrayList<>(this.getChildren());
            for(int j = getChildren().indexOf(ball)+1 ; j < list.size(); j++){
                Ball nextBall = (Ball) list.get(j);
                if(ball.getBoundsInParent().intersects(nextBall.getBoundsInParent())){
                    ball.setRadius(ball.getRadius() + nextBall.getRadius());
                    getChildren().remove(nextBall);
                }
            }
            
        }
    }

    public void removeBall(Event e){
        try {
            Ball ball = (Ball) e.getTarget();
            this.getChildren().remove(ball);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    class Ball extends Circle {
        private double dx=1,dy=1;
        public Ball(double x, double y, double radius, Color color){
            super(x,y,radius);
            setFill(color);
        }
    }
}

