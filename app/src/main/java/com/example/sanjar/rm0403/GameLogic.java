package com.example.sanjar.rm0403;

/**
 * Created by Sanjar on 19.03.2017.
 */

public class GameLogic {
GameGrid grid;
    private boolean active;


    public GameLogic(GameGrid grid){
this.grid=grid;
        restart();
    }

    public void restart(){
        grid.fillE();

    }


    public boolean isVictory(){
        active = true;
        if (grid.getContent(1,1)=='z'){
            active = false;
        }
        return active;
    }

}