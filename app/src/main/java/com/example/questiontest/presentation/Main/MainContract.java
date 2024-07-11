package com.example.questiontest.presentation.Main;

import com.example.questiontest.data.madel.Question;
import com.example.questiontest.data.madel.QuestionData;

import java.util.List;

public interface MainContract {
    interface Model{
        void setQuestion(Question question);
    }
    interface View{
        void onClick();

    }
    interface Presinter{
        void setQuestion(Question question);
    }
}
