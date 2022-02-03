package com.sortlinkedlist.exercise_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage){
        Scene scene = new Scene(new GUI(), 400, 240);
        stage.setTitle("Exercise 02 ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}