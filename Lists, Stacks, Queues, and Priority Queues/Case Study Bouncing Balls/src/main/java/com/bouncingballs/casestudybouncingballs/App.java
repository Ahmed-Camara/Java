package com.bouncingballs.casestudybouncingballs;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {
    @Override
    public void start(Stage stage){
        MultipleBallPlane ballPlane = new MultipleBallPlane();
        ballPlane.setStyle("-fx-border-color: yellow");

        Button btAdd = new Button("+");
        Button btSubstract = new Button("-");

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btAdd,btSubstract);
        hBox.setAlignment(Pos.CENTER);

        btAdd.setOnAction(e-> ballPlane.add());
        btSubstract.setOnAction(e->ballPlane.substract());

        ballPlane.setOnMousePressed(e->ballPlane.pause());
        ballPlane.setOnMouseReleased(e->ballPlane.play());

        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPlane.rateProperty().bind(sbSpeed.valueProperty());

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPlane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Multiple Bouncing Balls");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static class MultipleBallPlane extends Pane{
        private final Timeline animation;

        public MultipleBallPlane(){
            animation = new Timeline(new KeyFrame(Duration.millis(50), e->moveBall()));
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
        public void play(){
            animation.play();
        }

        public void pause(){
            animation.pause();
        }

        public void increaseSpeed(){
            animation.setRate(animation.getRate() + 0.1);
        }
        public void decreaseSpeed(){
            animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        }

        public DoubleProperty rateProperty(){
            return animation.rateProperty();
        }

        protected void moveBall(){
            for (Node node : this.getChildren()){
                Ball ball = (Ball) node;
                if(ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth()-ball.getRadius()){
                    ball.dx *= -1;
                }

                if(ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()){
                    ball.dy *= -1;
                }

                ball.setCenterX(ball.dx + ball.getCenterX());
                ball.setCenterY(ball.dy + ball.getCenterY());
            }
        }

    }

    static class Ball extends Circle{
        private double dx=1,dy=1;
        public Ball(double x, double y, double radius, Color color){
            super(x,y,radius);
            setFill(color);
        }
    }
}