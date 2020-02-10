package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private EditText edtWidth;
    private EditText edtHeight;
    private EditText edtLength;
    private Button btnCalculate;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWidth = findViewById(R.id.edt_width);
        edtHeight = findViewById(R.id.edt_height);
        edtLength = findViewById(R.id.edt_length);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn_calculate){
            String inputLength  = edtLength.getText().toString().trim();
            String inputWidth  = edtWidth.getText().toString().trim();
            String inputHeight  = edtHeight.getText().toString().trim();

            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            if(TextUtils.isEmpty(inputLength)){
                isEmptyFields = true;
                edtLength.setError("Tidak boleh kosong");
            }
            if(TextUtils.isEmpty(inputLength)){
                isEmptyFields = true;
                edtLength.setError("Tidak boleh kosong");
            }
        }
    }
}
