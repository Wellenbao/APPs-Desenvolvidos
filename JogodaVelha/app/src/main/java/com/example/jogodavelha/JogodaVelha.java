package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JogodaVelha extends AppCompatActivity {
    String jogador = "X";
    String[][] matrizVerificacao = new String[3][3];
    int jogadas = 0;

    public void trocaJogador() {
        if (jogador.equals("X")) {
            jogador = "O";
        } else {
            jogador = "X";
        }
        jogadas = jogadas + 1;
    }

    private void inicializaMatrizVerificacao() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matrizVerificacao[linha][coluna] = String.valueOf(linha) + String.valueOf(coluna);
            }
        }
    }

    private boolean verificaGanhador() {
        boolean ganhador = false;
        if (matrizVerificacao[0][0].equals(matrizVerificacao[0][1]) && matrizVerificacao[0][0].equals(matrizVerificacao[0][2])) {
            ganhador = true;
        }
        if (matrizVerificacao[1][0].equals(matrizVerificacao[1][1]) && matrizVerificacao[1][0].equals(matrizVerificacao[1][2])) {
            ganhador = true;
        }
        if (matrizVerificacao[2][0].equals(matrizVerificacao[2][1]) && matrizVerificacao[2][0].equals(matrizVerificacao[2][2])) {
            ganhador = true;
        }
        if (matrizVerificacao[0][0].equals(matrizVerificacao[1][0]) && matrizVerificacao[0][0].equals(matrizVerificacao[2][0])) {
            ganhador = true;
        }
        if (matrizVerificacao[0][1].equals(matrizVerificacao[1][1]) && matrizVerificacao[0][1].equals(matrizVerificacao[2][1])) {
            ganhador = true;
        }
        if (matrizVerificacao[0][2].equals(matrizVerificacao[1][2]) && matrizVerificacao[0][2].equals(matrizVerificacao[2][2])) {
            ganhador = true;
        }
        if (matrizVerificacao[0][0].equals(matrizVerificacao[1][1]) && matrizVerificacao[0][0].equals(matrizVerificacao[2][2])) {
            ganhador = true;
        }
        if (matrizVerificacao[0][2].equals(matrizVerificacao[1][1]) && matrizVerificacao[0][2].equals(matrizVerificacao[2][0])) {
            ganhador = true;
        }
        return ganhador;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogodavelha);
        getSupportActionBar().hide();
        Button btn01Prog = (Button) findViewById(R.id.btn01);
        Button btn02Prog = (Button) findViewById(R.id.btn02);
        Button btn03Prog = (Button) findViewById(R.id.btn03);
        Button btn04Prog = (Button) findViewById(R.id.btn04);
        Button btn05Prog = (Button) findViewById(R.id.btn05);
        Button btn06Prog = (Button) findViewById(R.id.btn06);
        Button btn07Prog = (Button) findViewById(R.id.btn07);
        Button btn08Prog = (Button) findViewById(R.id.btn08);
        Button btn09Prog = (Button) findViewById(R.id.btn09);
        TextView txtJogadorProg = (TextView) findViewById(R.id.txtJogador);
        Button btnResetProg = (Button) findViewById(R.id.btnReplay);

        inicializaMatrizVerificacao();
        btn01Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn01Prog.setText(jogador);
                btn01Prog.setClickable(false);
                matrizVerificacao[0][0] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btn02Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn02Prog.setText(jogador);
                btn02Prog.setClickable(false);
                matrizVerificacao[0][1] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btn03Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn03Prog.setText(jogador);
                btn03Prog.setClickable(false);
                matrizVerificacao[0][2] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA");
                    }
                }
            }
        });

        btn04Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn04Prog.setText(jogador);
                btn04Prog.setClickable(false);
                matrizVerificacao[1][0] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btn05Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn05Prog.setText(jogador);
                btn05Prog.setClickable(false);
                matrizVerificacao[1][1] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btn06Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn06Prog.setText(jogador);
                btn06Prog.setClickable(false);
                matrizVerificacao[1][2] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btn07Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn07Prog.setText(jogador);
                btn07Prog.setClickable(false);
                matrizVerificacao[2][0] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btn08Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn08Prog.setText(jogador);
                btn08Prog.setClickable(false);
                matrizVerificacao[2][1] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btn09Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn09Prog.setText(jogador);
                btn09Prog.setClickable(false);
                matrizVerificacao[2][2] = jogador;
                if (verificaGanhador()) {
                    txtJogadorProg.setText("GANHADOR: " + jogador);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn03Prog.setClickable(false);
                    btn04Prog.setClickable(false);
                    btn05Prog.setClickable(false);
                    btn06Prog.setClickable(false);
                    btn07Prog.setClickable(false);
                    btn08Prog.setClickable(false);
                    btn09Prog.setClickable(false);
                } else {
                    trocaJogador();
                    txtJogadorProg.setText("JOGADOR " + jogador);
                    if (jogadas == 9) {
                        txtJogadorProg.setText("VELHA!");
                    }
                }
            }
        });

        btnResetProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn01Prog.setClickable(true);
                btn01Prog.setText("");
                btn02Prog.setClickable(true);
                btn02Prog.setText("");
                btn03Prog.setClickable(true);
                btn03Prog.setText("");
                btn04Prog.setClickable(true);
                btn04Prog.setText("");
                btn05Prog.setClickable(true);
                btn05Prog.setText("");
                btn06Prog.setClickable(true);
                btn06Prog.setText("");
                btn07Prog.setClickable(true);
                btn07Prog.setText("");
                btn08Prog.setClickable(true);
                btn08Prog.setText("");
                btn09Prog.setClickable(true);
                btn09Prog.setText("");
                inicializaMatrizVerificacao();
                jogadas = 0;
                txtJogadorProg.setText("JOGADOR " + jogador);
            }
        });
    }
}