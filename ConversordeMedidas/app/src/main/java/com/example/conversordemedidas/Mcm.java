package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mcm extends AppCompatActivity {

    EditText edtM2Prog;
    EditText edtCmProg;
    Button btnConv2Prog;
    Button btnli2Prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);
        getSupportActionBar().hide();

        edtM2Prog = (EditText) findViewById(R.id.edtM2);
        edtCmProg = (EditText) findViewById(R.id.edtCm);
        btnConv2Prog = (Button) findViewById(R.id.btnConv2);
        btnli2Prog = (Button) findViewById(R.id.btnli2);

        btnConv2Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double m = Double.parseDouble(edtM2Prog.getText().toString());
                double cm = m / 100;
                edtCmProg.setText(String.valueOf(cm));
            }
        });

        btnli2Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtM2Prog.setText("");
                edtCmProg.setText("");
                edtM2Prog.requestFocus();
            }
        });
    }
}
