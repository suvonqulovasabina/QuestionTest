package com.example.questiontest.presentation.Scrin;

import static android.view.View.INVISIBLE;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.questiontest.R;
import com.example.questiontest.data.madel.QuestionData;

import java.util.ArrayList;
import java.util.List;

public class MainScrin extends AppCompatActivity implements MainScrinCantract.View {
    List<ViewGroup> variantID;
    List<ImageView> imageViews;
    List<TextView> varian;
    TextView textView;


    int countTrue;

    Button back;
    Button EnebleIcon;
    int countFalse;
    MainScrinCantract.Presinter presinter;
    Button button;
    Button button1;
    TextView textView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        init();
//        findViewById(R.id.exit).setOnClickListener(v->{
//            finish();
//        });


        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(Color.parseColor("#98d8ff"));
        presinter = new MainScrinpresinter(this);
    }

    @SuppressLint("WrongViewCast")
    private void init() {
        textView1 = findViewById(R.id.son);
        button = findViewById(R.id.bt);
        button1 = findViewById(R.id.bt2);
        textView = findViewById(R.id.text);
        variantID = new ArrayList<>();
        variantID.add(findViewById(R.id.container1));
        variantID.add(findViewById(R.id.container2));
        variantID.add(findViewById(R.id.container3));
        variantID.add(findViewById(R.id.container4));
        imageViews = new ArrayList<>();
        imageViews.add(findViewById(R.id.image_vertical1));
        imageViews.add(findViewById(R.id.image_vertical2));
        imageViews.add(findViewById(R.id.image_vertical3));
        imageViews.add(findViewById(R.id.image_vertical4));
        varian = new ArrayList<>();
        varian.add(findViewById(R.id.text1));
        varian.add(findViewById(R.id.text2));
        varian.add(findViewById(R.id.text3));
        varian.add(findViewById(R.id.text4));

        button.setEnabled(false);
        button.setOnClickListener(v ->{
            presinter.ButtonOnclick();
        });
        try {
            back.setOnClickListener(v -> {
                finish();
            });
        } catch (Exception e) {

        }

        for (int i = 0; i < variantID.size(); i++) {
            int index = i;
            variantID.get(i).setOnClickListener(v -> {
                presinter.onclick(index);
            });
        }


        button1.setOnClickListener(v -> {
            MyDialog dialog = new MyDialog();

            dialog.setEventListener(this::onclick);
            dialog.show(getSupportFragmentManager(), "");
        });

    }

    @Override
    public void setQuestion(QuestionData question) {
        //  textView1.setText(count);
        textView.setText(question.getSavol());
        for (int i = 0; i < varian.size(); i++) {
            varian.get(i).setText(question.getVariant()[i]);
        }
    }
    @Override
    public void ButtonNext(boolean b) {

        button.setEnabled(b);
    }
    @Override
    public void ClearIcon(int index) {
        imageViews.get(index).setImageResource(R.drawable.ic_unchecked);
    }

    @Override
    public void NOClearIcon(int index) {
        imageViews.get(index).setImageResource(R.drawable.aylana
        );
    }

    @Override
    public void intCount(int current, int length) {
        if (current != 10) {
            textView1.setText(String.valueOf(current + 1));
        }
    }

    @Override
    public void onclick() {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("savol", countTrue);
        intent.putExtra("savol2", countFalse);
        startActivity(intent);
        finish();
    }

    @Override
    public void count(int a, int b) {
        countTrue = a;
        countFalse = b;
    }

    @Override
    public void clickButton() {

    }
}