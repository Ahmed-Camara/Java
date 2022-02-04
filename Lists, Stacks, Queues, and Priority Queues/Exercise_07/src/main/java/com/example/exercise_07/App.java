package com.example.exercise_07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Hangman hangman = new Hangman();
        Scene scene = new Scene(hangman);
        stage.setTitle("hangman");
        stage.setScene(scene);
        stage.show();
        hangman.requestFocus();
    }

    public static void main(String[] args) {
        launch();
    }
}