package com.example.modul1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edtTinggi, edtBerat;
    private Button btnHasil;
    private TextView txtViewHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTinggi = findViewById(R.id.inp_TinggiBadan);
        edtBerat = findViewById(R.id.inp_BeratBadan);
        btnHasil = findViewById(R.id.btn_hitungBMI);
        txtViewHasil = findViewById(R.id.print_hasil);
        btnHasil.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn_hitungBMI){
            String inputBerat = edtBerat.getText().toString().trim();
            String inputTinggi = edtTinggi.getText().toString().trim();
            double berat = toDouble(inputBerat);
            double tinggi = toDouble(inputTinggi);
            double BMI  = berat/Math.pow(tinggi,2);

            txtViewHasil.setText(String.valueOf(BMI));
        }

    }
    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
