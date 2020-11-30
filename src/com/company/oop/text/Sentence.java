package com.company.oop.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence implements PartOfText{
    private List<String> sentence;

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }

    public Sentence(){
    sentence = new ArrayList<>();
}
public void add(Word word){
    sentence.add(word.getWord());
}

    @Override
    public List<String> print(Sentence sentence) {
        List<String> result =  sentence.getSentence();
        List<String> list= new ArrayList<>();
        for (String str: result) {
            list.add(str);
        }
        return list;
    }

    public  List<String> getWord(String sentence) {
        String[] words = sentence.split(" ");
        return Arrays.asList(words);
    }


    public List<String> getSentence() {
        return sentence;
    }

    public void setSentence(List<String> sentence) {
        this.sentence = sentence;
    }
}
