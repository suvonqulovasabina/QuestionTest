package com.example.questiontest.presentation.Scrin;

import android.util.Log;

import com.example.questiontest.data.madel.QuestionData;

import java.util.ArrayList;
import java.util.List;

public class MainScrinpresinter implements MainScrinCantract.Presinter {
    MainScrinCantract.View view;
    MainScrinCantract.Model model;
    int countTrue;
    int countFalse;
    List<QuestionData> questionDat = new ArrayList<>();

    private int index = 0;
    private int positsiya = -1;

    public MainScrinpresinter(MainScrinCantract.View view) {
        this.view = view;
        model = new MainScrinModel();
        getQuestion();
        getIndexQuestion();
    }

    private void getQuestion() {
        questionDat = model.getQuestiondat();
    }

    private void getIndexQuestion() {
        view.setQuestion(questionDat.get(index));

    }

    @Override
    public void onclick(int pos) {
        if (pos == positsiya) return;
        if (positsiya > -1) {
            view.ClearIcon(positsiya);
//            view.ButtonNext(false);
        }
        positsiya = pos;
        view.NOClearIcon(pos);
        view.ButtonNext(true);
        Log.d("TTT", "YYY");
    }

    @Override
    public void ButtonOnclick() {
        if (positsiya == -1) return;
        QuestionData data = model.getQuestiondat().get(index);
        if (data.getAnswer().equals(data.getVariant()[positsiya])) {
            countTrue++;
        } else {
            countFalse++;
        }
        index++;
        view.intCount(index, questionDat.size());
        view.count(countTrue, countFalse);
        view.ButtonNext(false);
        Log.d("TTT", "MMM");
        view.ClearIcon(positsiya);
        positsiya = -1;

        if (index == questionDat.size()) {
            view.onclick();
        } else {
            view.setQuestion(questionDat.get(index));
        }

    }

    @Override
    public void ButtonOnclickStop() {

    }


}
