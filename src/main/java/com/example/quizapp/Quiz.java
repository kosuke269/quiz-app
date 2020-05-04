package com.example.quizapp;
//アクセス修飾子
public class Quiz {

    /**
     * 問題文
     */
    private String question;

    /**
     * クイズの正解
     */
    private boolean answer;

    public Quiz(String question,boolean answer){
        this.question=question;
        this.answer=answer;
    }

    public String getQuestion(){
        return question;
    }
    public boolean isAnswer(){
        return answer;
    }

    @Override
    public String toString(){
//        条件演算子
        String marubatsu=answer?"○":"×";
//        if(answer){
//            marubatsu="○";
//        }else{
//            marubatsu="×";
//        }
        return question+" "+marubatsu;
    }
}

