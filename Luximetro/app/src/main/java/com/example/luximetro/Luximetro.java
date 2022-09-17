package com.example.luximetro;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Luximetro extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensor;
    private SensorEventListener sensorEventListener;
    float ResultProg = 0;
    float Menor = 40000;
    float Maior = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luximetro);
        getSupportActionBar().hide();

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if (sensor == null) {
            Toast.makeText(this, "O dispositivo incompatível!", Toast.LENGTH_SHORT).show();
            finish();
        }
        sensorEventListener = new SensorEventListener() {

            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                float value = sensorEvent.values[0];
                ResultProg = value;
                TextView txtResultadoProg = (TextView) findViewById(R.id.txtResultado);
                txtResultadoProg.setText("Luminosidade: " + value + " lx");

                if (ResultProg < Menor) {
                    Menor = ResultProg;
                    TextView txtResultMenorProg = (TextView) findViewById(R.id.txtMenor);
                    txtResultMenorProg.setText("Menor Luminosidade: " + Menor + " lx");
                }

                if (ResultProg > Maior) {
                    Maior = ResultProg;
                    TextView txtResultMaiorProg = (TextView) findViewById(R.id.txtMaior);
                    txtResultMaiorProg.setText("Maior Luminosidade: " + Maior + " lx");
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(sensorEventListener, sensor, SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(sensorEventListener);
    }
}
