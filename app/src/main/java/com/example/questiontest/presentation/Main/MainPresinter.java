package com.example.questiontest.presentation.Main;

import com.example.questiontest.data.madel.Question;

public class MainPresinter implements MainContract.Presinter{
    MainContract.View view;
    MainContract.Model model;

    public MainPresinter(MainContract.View view) {
        this.view = view;
        model = new MainModel();
    }
    @Override
    public void setQuestion(Question question) {
      model.setQuestion(question);
      view.onClick();
    }
}
