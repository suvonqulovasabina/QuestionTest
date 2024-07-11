package com.example.questiontest.presentation.Main;

import com.example.questiontest.data.madel.Question;
import com.example.questiontest.domain.AppControl;

public class MainModel implements MainContract.Model{
    AppControl appControl=AppControl.geInstance();
    @Override
    public void setQuestion(Question question) {
        appControl.setQuestion(question);
    }
}
