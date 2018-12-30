package com.example.unknown.tictactoe;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button reset;
    TextView box00, box01, box02, box10, box11, box12, box20, box21, box22, playerX, playerO;
    int playerTurn = 1, winner;
    boolean isOver = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box00 = findViewById(R.id.block_00);
        box01 = findViewById(R.id.block_01);
        box02 = findViewById(R.id.block_02);
        box10 = findViewById(R.id.block_10);
        box11 = findViewById(R.id.block_11);
        box12 = findViewById(R.id.block_12);
        box20 = findViewById(R.id.block_20);
        box21 = findViewById(R.id.block_21);
        box22 = findViewById(R.id.block_22);
        reset = findViewById(R.id.btn_reset);

        box00.setText("");
        box01.setText("");
        box02.setText("");
        box10.setText("");
        box11.setText("");
        box12.setText("");
        box20.setText("");
        box21.setText("");
        box22.setText("");

        playerX = findViewById(R.id.playerx_text);
        playerO = findViewById(R.id.playero_text);
        changePlayerTextColor();


        box00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box00.getText() == "" && playerTurn == 1) {
                        box00.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box00.getText() == "" && playerTurn == 2) {
                        box00.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box01.getText() == "" && playerTurn == 1) {
                        box01.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box01.getText() == "" && playerTurn == 2) {
                        box01.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box02.getText() == "" && playerTurn == 1) {
                        box02.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box02.getText() == "" && playerTurn == 2) {
                        box02.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box10.getText() == "" && playerTurn == 1) {
                        box10.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box10.getText() == "" && playerTurn == 2) {
                        box10.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box11.getText() == "" && playerTurn == 1) {
                        box11.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box11.getText() == "" && playerTurn == 2) {
                        box11.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box12.getText() == "" && playerTurn == 1) {
                        box12.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box12.getText() == "" && playerTurn == 2) {
                        box12.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box20.getText() == "" && playerTurn == 1) {
                        box20.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box20.getText() == "" && playerTurn == 2) {
                        box20.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box21.getText() == "" && playerTurn == 1) {
                        box21.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box21.getText() == "" && playerTurn == 2) {
                        box21.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        box22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOver) {
                    showGameOverToast();
                } else {
                    if (box22.getText() == "" && playerTurn == 1) {
                        box22.setText("x");
                        isWin();
                        changePlayerTextColor();
                    } else if (box22.getText() == "" && playerTurn == 2) {
                        box22.setText("o");
                        isWin();
                        changePlayerTextColor();
                    }
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOver = false;
                resetGame();
                Toast.makeText(MainActivity.this, "Reset completed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void resetGame() {
        if(winner == 1){
            playerTurn = 2;
        }else if(winner == 2){
            playerTurn = 1;
        }
        box00.setText("");
        box01.setText("");
        box02.setText("");
        box10.setText("");
        box11.setText("");
        box12.setText("");
        box20.setText("");
        box21.setText("");
        box22.setText("");
    }


    public void isWin() {
        if(playerTurn == 1){
            playerTurn = 2;
        }else if(playerTurn == 2){
            playerTurn = 1;
        }
        String text00 = (String) box00.getText();
        String text01 = (String) box01.getText();
        String text02 = (String) box02.getText();
        String text10 = (String) box10.getText();
        String text11 = (String) box11.getText();
        String text12 = (String) box12.getText();
        String text20 = (String) box20.getText();
        String text21 = (String) box21.getText();
        String text22 = (String) box22.getText();
        if (text00 == text01 && text01 == text02) {
            if (text02 == "x") {
                showToast("X");
            } else if (text02 == "o") {
                showToast("O");
            }
        } else if (text10 == text11 && text11 == text12) {
            if (text12 == "x") {
                showToast("X");
            } else if (text12 == "o") {
                showToast("O");
            }
        } else if (text20 == text21 && text21 == text22) {
            if (text22 == "x") {
                showToast("X");
            } else if (text22 == "o") {
                showToast("O");
            }
        } else if (text00 == text10 && text10 == text20) {
            if (text20 == "x") {
                showToast("X");
            } else if (text20 == "o") {
                showToast("O");
            }
        } else if (text01 == text11 && text11 == text21) {
            if (text21 == "x") {
                showToast("X");
            } else if (text21 == "o") {
                showToast("O");
            }
        } else if (text02 == text12 && text12 == text22) {
            if (text22 == "x") {
                showToast("X");
            } else if (text22 == "o") {
                showToast("O");
            }
        } else if (text00 == text11 && text11 == text22) {
            if (text22 == "x") {
                showToast("X");
            } else if (text22 == "o") {
                showToast("O");
            }
        } else if (text02 == text11 && text11 == text20) {
            if (text20 == "x") {
                showToast("X");
            } else if (text20 == "o") {
                showToast("O");
            }
        }
    }

    public void showToast(String s) {
        isOver = true;
        Toast.makeText(this, "Player " + s + " won the game", Toast.LENGTH_SHORT).show();
    }
    public void showGameOverToast(){
        Toast.makeText(this, "Game over. Click reset to replay.", Toast.LENGTH_LONG).show();
    }

    public void changePlayerTextColor(){
        if(playerTurn == 1){
            playerO.setTextColor(getResources().getColor(R.color.gray));
            playerX.setTextColor(getResources().getColor(R.color.black));
        }else if(playerTurn == 2){
            playerX.setTextColor(getResources().getColor(R.color.gray));
            playerO.setTextColor(getResources().getColor(R.color.black));
        }
    }
}
