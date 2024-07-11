package com.example.questiontest.presentation.Main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.questiontest.R;
import com.example.questiontest.data.madel.Question;
import com.example.questiontest.presentation.Scrin.MainScrin;

public class Splash extends AppCompatActivity  {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#98d8ff"));
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.S){
            openMenuScreen();
        }else {
            Handler handler = new Handler(getMainLooper());
            handler.postDelayed(() -> {
                openMenuScreen();
                finish();
            },2000);
        }
    }
    private void openMenuScreen(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    }
