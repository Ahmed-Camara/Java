package com.example.exercise_26;

public class MazeSolver {
    private char [][]maze;

    public MazeSolver(){}
    public MazeSolver(char [][]maze){
        this.maze = maze;
    }
    public char [][]getMazeMatrix(int rows,int cols){

        char [][]chars = new char[rows][cols];

        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars[i].length; j++){
                chars[i][j] = '.';
            }
        }
        return  chars;
    }
}
