package com.example.quizapp;
//オブジェクト
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
     //JUnit
    @Override
    public String toString(){
//        条件演算子
        String marubatsu=answer?"○":"×";
        return question+" "+marubatsu;
    }
    //line...
    // 問題文 ○ length 5 -2 endIndex 3
    //もんだいぶん１× length9-2 endIndex 7
    public static Quiz fromString(String line){
        String question = line.substring(0,line.length()-2);
        boolean anser =line.endsWith("○");

        return new Quiz(question,anser);
    }
}

