package com.example.questiontest.data.madel;

public class QuestionData {
    String savol;
    String []variant;
    String answer;

    public QuestionData(String savol,String s,String s1,String s2,String s3, String answer) {
        this.savol = savol;
        variant=new String[]{s,s1,s2,s3};
        this.answer = answer;
    }

    public String getSavol() {
        return savol;
    }

    public String[] getVariant() {
        return variant;
    }

    public String getAnswer() {
        return answer;
    }
}
