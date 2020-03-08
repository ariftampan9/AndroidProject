package com.example.hokepapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hokepapp.ui.login.LoginActivity;

public class SignUp_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);
        TextView tvMasuk = findViewById(R.id.Masuk);
        tvMasuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.Masuk){
            Intent pindahLogin = new Intent(SignUp_Activity.this, LoginActivity.class);
            startActivity(pindahLogin);
        }
    }
}
