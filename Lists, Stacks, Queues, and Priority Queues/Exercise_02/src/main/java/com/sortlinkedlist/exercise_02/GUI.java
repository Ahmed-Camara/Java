package com.sortlinkedlist.exercise_02;

import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class GUI extends BorderPane {

    private String result;
    private LinkedList<Integer> list;
    private TextArea textArea = new TextArea();
    public GUI(){
        list = new LinkedList<>();
        result = "";
        drawGUI();
    }

    private void drawGUI(){
        Label label = new Label("Enter a number : ");
        TextField textField = new TextField();
        textField.setPrefColumnCount(6);
        HBox hBox = new HBox(10);

        hBox.getChildren().addAll(label,textField);

        textField.setOnAction(e->getNumber(e));
        Button btSort = new Button("Sort");
        Button btShuffle = new Button("Shuffle");
        Button btReverse = new Button("Reverse");

        btSort.setOnAction(e-> sort());
        btReverse.setOnAction(e->reverse());
        btShuffle.setOnAction(e->shuffle());
        HBox hBox1 = new HBox(10);

        hBox1.getChildren().addAll(btSort,btShuffle,btReverse);

        setPadding(new Insets(10));
        setTop(hBox);
        setCenter(textArea);
        setBottom(hBox1);
    }

    private void getNumber(Event e){
        TextField text = (TextField) e.getSource();
        String res = text.getText();

        if(res.length() == 0){
            return;
        }
        Integer num = Integer.parseInt(res);

        if(!list.contains(num)){
            list.add(num);
        }
        text.clear();
    }
    private void updateTextArea(){
        result = result+"\n";
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            result = result + iterator.next()+"  ";
        }
        textArea.setText(result);
    }

    private void sort(){
        Collections.sort(list);
        updateTextArea();
    }

    private void reverse(){
        textArea.setText(" ");
        Collections.reverse(list);
        updateTextArea();
    }

    private void shuffle(){
        Collections.shuffle(list);
        updateTextArea();
    }

}
