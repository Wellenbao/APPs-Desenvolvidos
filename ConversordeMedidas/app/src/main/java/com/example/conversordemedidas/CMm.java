package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CMm extends AppCompatActivity {

    EditText edtCm1Prog;
    EditText edtM3Prog;
    Button btnConv3Prog;
    Button btnli3Prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmm);
        getSupportActionBar().hide();

        edtCm1Prog = (EditText) findViewById(R.id.edtCm1);
        edtM3Prog = (EditText) findViewById(R.id.edtM3);
        btnConv3Prog = (Button) findViewById(R.id.btnConv3);
        btnli3Prog = (Button) findViewById(R.id.btnli3);

        btnConv3Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cm = Double.parseDouble(edtCm1Prog.getText().toString());
                double m = cm * 100;
                edtM3Prog.setText(String.valueOf(m));
            }
        });

        btnli3Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtCm1Prog.setText("");
                edtM3Prog.setText("");
                edtCm1Prog.requestFocus();
            }
        });
    }
}