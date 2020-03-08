package com.example.hokepapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.hokepapp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMulai = findViewById(R.id.mulai);
        btnMulai.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.mulai){
            Intent loginSignupPage = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginSignupPage);
        }

    }
}
