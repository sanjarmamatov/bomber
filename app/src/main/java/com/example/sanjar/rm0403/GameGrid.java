package com.example.sanjar.rm0403;

import java.util.Arrays;

/**
 * Created by Sanjar on 19.03.2017.
 */

public class GameGrid {

    private char[][] gridArray;
    private char turn;
    private String message;



    public GameGrid(){
        gridArray = new char[3][3];
        fillE();
    }

    public void fillE(){
        Arrays.fill(gridArray[0], 'e');
        Arrays.fill(gridArray[1], 'e');
        Arrays.fill(gridArray[2], 'e');
        gridArray[1][1] = 'b';
        turn = 'x';
        message = "hodit p1";
    }


    public char getTurn(){
        return turn;
    }
    public void setTurn(char symbol){
        turn = symbol;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public char getContent(int x, int y){
        return gridArray[x][y];
    }

    public void setContent(int x, int y, char symbol){
        gridArray[x][y]=symbol;
    }















}
