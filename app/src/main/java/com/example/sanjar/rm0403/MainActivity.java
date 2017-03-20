package com.example.sanjar.rm0403;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b00,b01,b02,b10,b11,b12,b20,b21,b22,br;
    TextView tv;
    View.OnClickListener oclBtn;
    GameGrid grid = new GameGrid();
    GameLogic logic = new GameLogic(grid);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()){
                    case R.id.b00:
                        update(b00,0,0);
                        break;
                    case R.id.b01:
                        update(b01,0,1);
                        break;
                    case R.id.b02:
                        update(b02,0,2);
                        break;
                    case R.id.b10:
                        update(b10,1,0);
                        break;
                    case R.id.b11:
                        update(b11,1,1);
                        break;
                    case R.id.b12:
                        update(b12,1,2);
                        break;
                    case R.id.b20:
                        update(b20,2,0);
                        break;
                    case R.id.b21:
                        update(b21,2,1);
                        break;
                    case R.id.b22:
                        update(b22,2,2);
                        break;
                    case R.id.restart:
                        restart();
                        break;

                }

            }
        };


        init();


    }

    public void init(){
        b00 = (Button) findViewById(R.id.b00);
        b01 = (Button) findViewById(R.id.b01);
        b02 = (Button) findViewById(R.id.b02);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        br = (Button) findViewById(R.id.restart);
        tv=(TextView)findViewById(R.id.textView);
        b00.setOnClickListener(oclBtn);
        b01.setOnClickListener(oclBtn);
        b02.setOnClickListener(oclBtn);
        b10.setOnClickListener(oclBtn);
        b11.setOnClickListener(oclBtn);
        b12.setOnClickListener(oclBtn);
        b20.setOnClickListener(oclBtn);
        b21.setOnClickListener(oclBtn);
        b22.setOnClickListener(oclBtn);
        br.setOnClickListener(oclBtn);

    }


    public void update(Button b, int x, int y){
        if(logic.isVictory()) {
            if (grid.getTurn() == 'x') {
                if (grid.getContent(x, y) == 'e') {
                    b.setText("O");
                    grid.setTurn('o');
                    grid.setMessage("hodit P2");
                    tv.setText(grid.getMessage());
                } else {
                    b.setText("X");
                    tv.setText("Loose P1");
                    grid.setContent(1, 1, 'z');
                }
            } else if (grid.getTurn() == 'o') {
                if (grid.getContent(x, y) == 'e') {
                    b.setText("O");
                    grid.setTurn('x');
                    grid.setMessage("hodit P1");
                    tv.setText(grid.getMessage());
                } else {
                    b.setText("X");
                    tv.setText("Loose P2");

                    grid.setContent(1, 1, 'z');

                }
            }
        }
    }
    public void restart(){
        logic.restart();
        //grid.fillE();
        fillnull();

    }

    public void fillnull(){
        b00.setText(" ");
        b01.setText(" ");
        b02.setText(" ");
        b10.setText(" ");
        b11.setText(" ");
        b12.setText(" ");
        b20.setText(" ");
        b21.setText(" ");
        b22.setText(" ");

    }




    }






