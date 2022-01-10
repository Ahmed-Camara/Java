package com.example.exercise_26;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class MazeGUI extends BorderPane {

    private int rows;
    private int cols;
    private GridPane gridPaneMaze;
    private char[][] maze;
    private MazeSolver mazeSolver = new MazeSolver();

    public MazeGUI(int rows,int cols){

        this.rows = rows;
        this.cols = cols;
        initialize();
    }
    public void initialize(){
        maze = mazeSolver.getMazeMatrix(rows,cols);
        drawMaze();
    }

    public void drawMaze(){
        gridPaneMaze = new GridPane();

        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){

                Rectangle rec = new Rectangle(50,50);

                if(maze[i][j]=='.'){
                    rec.setFill(Color.WHITE);
                }else if(maze[i][j] == 'X'){
                    rec.setFill(Color.RED);
                }else if(maze[i][j] == '@'){
                    rec.setFill(Color.GREEN);
                }

                rec.setStroke(Color.BLACK);
                rec.setOnMouseClicked(e-> placeMazeWall(e));
                gridPaneMaze.add(rec,j,i);
            }
        }

        Button btFindPath = new Button("Find path");
        Button btClearPath = new Button("Clear path");
        btFindPath.setOnAction(e-> findPath());
        btClearPath.setOnAction(e-> clearPath());
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btFindPath,btClearPath);
        hBox.setAlignment(Pos.CENTER);

        setCenter(gridPaneMaze);
        setBottom(hBox);
    }

    public void placeMazeWall(MouseEvent e){
        Rectangle rec = (Rectangle)e.getSource();
        int row = gridPaneMaze.getRowIndex(rec);
        int cols = gridPaneMaze.getColumnIndex(rec);

        Paint color = rec.getFill();

        if(color.equals(Color.GREEN)){
            return;
        }
        if(color.equals(Color.WHITE)){
            rec.setFill(Color.RED);
            maze[row][cols] = 'X';
        }else{
            rec.setFill(Color.WHITE);
            maze[row][cols] = '.';
        }


    }

    private void findPath(){
        gridPaneMaze.getChildren().clear();
        mazeSolver = new MazeSolver(maze);
        maze = mazeSolver.start();
        drawMaze();
    }
    private void clearPath(){
        gridPaneMaze.getChildren().clear();
        initialize();
    }
}
