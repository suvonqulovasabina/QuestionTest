package com.example.questiontest.presentation.Scrin;

import com.example.questiontest.data.madel.QuestionData;
import com.example.questiontest.domain.AppControl;

import java.util.List;

public class MainScrinModel implements MainScrinCantract.Model{
    AppControl appControl=AppControl.geInstance();
    @Override
    public List<QuestionData> getQuestiondat() {
        return appControl.getQuestiondat();
    }
}
