package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void btnGoHome(View view){
        setContentView(R.layout.activity_main);
    }
    public void btnGoSignUp(View view){
        setContentView(R.layout.signup);
    }


    public void goToMain(View view){
        setContentView(R.layout.activity_main);
    }
    public void goToLogIn(View view){
        setContentView(R.layout.login);
    }


}