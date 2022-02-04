package com.example.exercise_05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage){
        BorderPane pane = new BorderPane();
        MultipleBallPlane ballPane = new MultipleBallPlane();

        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        Button btAdd = new Button("+");
        Button btSubstract = new Button("-");
        Button btSuspend = new Button("Suspend");
        Button btResume = new Button("Resume");

        btAdd.setOnAction(e->ballPane.add());
        btSubstract.setOnAction(e->ballPane.substract());
        btSuspend.setOnAction(e->ballPane.suspend());
        btResume.setOnAction(e->ballPane.resume());

        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10));
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btAdd,btSubstract,btSuspend,btResume);

        pane.setTop(sbSpeed);
        pane.setCenter(ballPane);
        pane.setBottom(hBox);
        Scene scene = new Scene(pane,800, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}