package com.example.questiontest.presentation.Main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.questiontest.R;
import com.example.questiontest.data.madel.Question;
import com.example.questiontest.presentation.Scrin.MainScrin;
import com.example.questiontest.presentation.info.InsoScreen;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    MainContract.Presinter presinter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presinter = new MainPresinter(this);
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#98d8ff"));
        getQuestion();
        findViewById(R.id.exit1).setOnClickListener(v->{
           findViewById(R.id.frem).setVisibility(View.VISIBLE);
            Button no=findViewById(R.id.no);
            Button yes=findViewById(R.id.yes);
          no.setOnClickListener(v1 ->{
              findViewById(R.id.frem).setVisibility(View.INVISIBLE);
          });
            yes.setOnClickListener(v1 ->{
               finish();
            });
        });
    }

    @Override
    public void onClick() {
        Intent intent = new Intent(this, MainScrin.class);
        startActivity(intent);
    }

    private void getQuestion() {
        findViewById(R.id.bt1).setOnClickListener(v -> {
            presinter.setQuestion(Question.MATIMATIKA);
        });
        findViewById(R.id.bt2).setOnClickListener(v -> {
            presinter.setQuestion(Question.FIZIKA);
        });
        findViewById(R.id.bt3).setOnClickListener(v -> {
            presinter.setQuestion(Question.INGILIZ_TILI);
        });
        findViewById(R.id.bt4).setOnClickListener(v -> {
            presinter.setQuestion(Question.Bialogiya);

        });
        findViewById(R.id.bt5).setOnClickListener(v -> {
            @SuppressLint("IntentWithNullActionLaunch")
            Intent intent = new Intent(this, InsoScreen.class);
            startActivity(intent);

        });
        findViewById(R.id.bt6).setOnClickListener(v -> {
            presinter.setQuestion(Question.Kimyo);
        });

//        findViewById(R.id.bt7).setOnClickListener(v -> {
//            presinter.setQuestion(Question.ONA_TILI);
//        });
    }
}