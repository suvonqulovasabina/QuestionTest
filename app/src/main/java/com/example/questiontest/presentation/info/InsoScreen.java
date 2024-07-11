package com.example.questiontest.presentation.info;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.questiontest.R;
import com.example.questiontest.data.madel.Question;
import com.example.questiontest.presentation.Main.MainActivity;
import com.example.questiontest.presentation.Main.MainContract;
import com.example.questiontest.presentation.Main.MainPresinter;
import com.example.questiontest.presentation.Scrin.MainScrin;
import com.example.questiontest.presentation.Scrin.MainScrinpresinter;

public class InsoScreen extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
      findViewById(R.id.idi).setOnClickListener(v->{
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
      });
    }

}