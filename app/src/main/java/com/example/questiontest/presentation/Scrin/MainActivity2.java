package com.example.questiontest.presentation.Scrin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.questiontest.R;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scrin);

        int a=getIntent().getIntExtra("savol",-1);
        int b=getIntent().getIntExtra("savol2",-1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView tv=findViewById(R.id.id1);
        tv.setText("Tog'ri Javoblar Soni:"+"  "+ a);
        @SuppressLint({"MissingInflatedId", "LocalSuppress", "WrongViewCast"})
        TextView tv1=findViewById(R.id.id2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ImageView image=findViewById(R.id.bakcVIN);
        image.setOnClickListener(v->{
            finish();
        });
        tv1.setText("Hato Javoblar Soni:"+"  "+ b);
    }
}