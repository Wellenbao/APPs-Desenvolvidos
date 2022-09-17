package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btnKMMProg;
    Button btnMKMProg;
    Button btnCMMProg;
    Button btnMCMProg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        btnKMMProg = (Button) findViewById(R.id.btnkmm);
        btnMKMProg = (Button) findViewById(R.id.btnmkm);
        btnCMMProg = (Button) findViewById(R.id.btncmm);
        btnMCMProg = (Button) findViewById(R.id.btnmcm);

        btnKMMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, KMm.class);
                startActivity(it);
            }
        });
        btnMKMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Mkm.class);
                startActivity(it);
            }
        });
        btnCMMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, CMm.class);
                startActivity(it);
            }
        });
        btnMCMProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Mcm.class);
                startActivity(it);
            }
        });
    }
}