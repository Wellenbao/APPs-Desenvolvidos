package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mkm extends AppCompatActivity {

    EditText edtM1Prog;
    EditText edtKm1Prog;
    Button btnConv1Prog;
    Button btnli1Prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkm);
        getSupportActionBar().hide();

        edtM1Prog = (EditText) findViewById(R.id.edtM1);
        edtKm1Prog = (EditText) findViewById(R.id.edtKm1);
        btnConv1Prog = (Button) findViewById(R.id.btnConv1);
        btnli1Prog = (Button) findViewById(R.id.btnli1);

        btnConv1Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double m = Double.parseDouble(edtM1Prog.getText().toString());
                double km = m / 1000;
                edtKm1Prog.setText(String.valueOf(km));
            }
        });

        btnli1Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtM1Prog.setText("");
                edtKm1Prog.setText("");
                edtM1Prog.requestFocus();
            }
        });
    }
}
