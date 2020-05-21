package com.cognizant.api.apple.word.model;


import java.util.List;
public class SaveRandomWord
{
    private int count;

    private List<List<String>> words;

    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    public void setWords(List<List<String>> words){
        this.words = words;
    }
    public List<List<String>> getWords(){
        return this.words;
    }
}
