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

    public char[][] start(){
        maze[0][0] = '@';
        int[][] possibleMoves = getPossiblesMoves(0,0);
        solve(possibleMoves);
        return maze;
    }

    public int[][] getPossiblesMoves(int row,int col){
        int[][] m = new int[4][2];
        m[0][0] = row + 1;
        m[0][1] = col;
        m[1][0] = row;
        m[1][1] = col + 1;
        m[2][0] = row;
        m[2][1] = col - 1;
        m[3][0] = row - 1;
        m[3][1] = col;
        return m;
    }

    public boolean solve(int[][] possibleMoves){

        if(maze[maze.length - 1][maze[0].length - 1] == '@')
            return true;

        else{
            for(int i = 0; i < possibleMoves.length; i++){

                int r = possibleMoves[i][0];
                int c = possibleMoves[i][1];

                if(isValidPath(r,c)){
                    maze[r][c] = '@';
                    if(solve(getPossiblesMoves(r,c))){
                        return true;
                    }else{
                        maze[r][c]='.';
                    }
                }
            }
        }

        return false;
    }
    public boolean isValidPath(int row, int col){
        if (row < 0 || row >= maze.length) { return false; }
        if (col < 0 || col >= maze[0].length) { return false; }
        if (maze[row][col] == 'X') { return false; }
        if (maze[row][col] == '@') { return false; }
        if (row > 0 && col < maze[0].length - 1 &&
                maze[row - 1][col] == '@' &&
                maze[row - 1][col + 1] == '@' &&
                maze[row][col + 1] == '@') { return false; }
        if (row > 0 && col > 0 &&
                maze[row - 1][col] == '@' &&
                maze[row - 1][col - 1] == '@' &&
                maze[row][col - 1] == '@') { return false; }
        if (row < maze.length - 1 && col < maze[0].length - 1 &&
                maze[row][col + 1] == '@' &&
                maze[row + 1][col + 1] == '@' &&
                maze[row + 1][col] == '@') { return false ;}
        if (row < maze.length - 1 && col > 0 &&
                maze[row][col - 1] == '@' &&
                maze[row + 1][col - 1] == '@' &&
                maze[row + 1][col] == '@') { return false; }
        return true;
    }
}
