package org.bstanimation.bstanimation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.bstanimation.bstanimation.controller.BST;
import org.bstanimation.bstanimation.view.BTView;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BST<Integer> tree = new BST<>();

        BTView view = new BTView(tree);
        BorderPane pane = new BorderPane();
        TextField tfKey = new TextField();
        tfKey.setPrefColumnCount(3);
        tfKey.setAlignment(Pos.BASELINE_RIGHT);

        Button btnInsert = new Button("Insert");
        Button btnDelete = new Button("Delete");

        pane.setCenter(view);
        btnInsert.setOnAction(e -> {

            int key = Integer.parseInt(tfKey.getText());
            System.out.println("KEY : "+key);
            if(tree.search(key)){
                view.displayTree();
                view.setStatus(key+" is already in the tree");
            }else{
                tree.insert(key);
                view.displayTree();
                view.setStatus(key+" is inserted in the tree");

            }
        });

        HBox hbox = new HBox(5);

        hbox.getChildren().addAll(new Label("Enter a key"),
                tfKey, btnInsert, btnDelete);
        hbox.setAlignment(Pos.CENTER);
        pane.setBottom(hbox);

        Scene scene = new Scene(pane, 450,250);
        stage.setTitle("BST Animation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}