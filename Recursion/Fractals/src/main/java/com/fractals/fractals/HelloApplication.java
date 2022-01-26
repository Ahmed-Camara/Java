package com.fractals.fractals;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.geometry.Point2D;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(e->trianglePane.setOrder(Integer.parseInt(tfOrder.getText())));
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(new Label("Enter an order : "),tfOrder);
        hbox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(trianglePane);
        borderPane.setBottom(hbox);

        Scene scene = new Scene(borderPane, 320, 240);
        stage.setTitle("Sierpinski Triangle Solver");
        stage.setScene(scene);
        stage.show();

        scene.widthProperty().addListener(ov -> trianglePane.paint());
        scene.heightProperty().addListener(ov -> trianglePane.paint());
    }

    public static void main(String[] args) {
        launch();
    }


    static class SierpinskiTrianglePane extends Pane {

        private int order = 0;

        SierpinskiTrianglePane(){}

        protected void paint(){
            Point2D p1 = new Point2D(getWidth() / 2,10);
            Point2D p2 = new Point2D(10,getHeight() - 10);
            Point2D p3 = new Point2D(getWidth() - 10,getHeight() - 10);

            this.getChildren().clear();

            displayTriangles(order,p1,p2,p3);
        }

        private void displayTriangles(int order,Point2D p1,Point2D p2, Point2D p3){

            if(order == 0){
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());
                triangle.setStroke(Color.BLACK);
                triangle.setFill(Color.WHITE);

                this.getChildren().add(triangle);
            }else{
                Point2D p12 = p1.midpoint(p2);
                Point2D p23 = p2.midpoint(p3);
                Point2D p31 = p3.midpoint(p1);

                displayTriangles(order-1,p1,p12,p31);
                displayTriangles(order-1,p12,p2,p23);
                displayTriangles(order-1,p31,p23,p3);
            }
        }

        public void setOrder(int order){
            this.order = order;
            paint();
        }
    }
}