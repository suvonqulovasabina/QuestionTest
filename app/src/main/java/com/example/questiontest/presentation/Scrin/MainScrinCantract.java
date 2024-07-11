package com.example.questiontest.presentation.Scrin;

import android.view.View;

import com.example.questiontest.data.madel.Question;
import com.example.questiontest.data.madel.QuestionData;

import java.util.List;

public interface MainScrinCantract {
    interface Model{
         List<QuestionData> getQuestiondat();
    }
    interface View{
        void setQuestion(QuestionData question);
        void ButtonNext(boolean b);
        void ClearIcon(int index);
        void NOClearIcon(int index);
        void intCount(int current, int length);
        void onclick();
        void count(int a, int b);
        void clickButton();
    }
    interface Presinter{
        void onclick(int pos);
        void ButtonOnclick();
        void ButtonOnclickStop();
    }
}
