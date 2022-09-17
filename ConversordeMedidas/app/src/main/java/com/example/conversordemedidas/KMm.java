package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KMm extends AppCompatActivity {

    EditText edtKmProg;
    EditText edtMProg;
    Button btnConvProg;
    Button btnliProg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmm);
        getSupportActionBar().hide();

        edtKmProg = (EditText) findViewById(R.id.edtKm);
        edtMProg = (EditText) findViewById(R.id.edtM);
        btnConvProg = (Button) findViewById(R.id.btnConv);
        btnliProg = (Button) findViewById(R.id.btnli);

        btnConvProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double km = Double.parseDouble(edtKmProg.getText().toString());
                double m = km * 1000;
                edtMProg.setText(String.valueOf(m));
            }
        });

        btnliProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtKmProg.setText("");
                edtMProg.setText("");
                edtKmProg.requestFocus();
            }
        });
    }
}