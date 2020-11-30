package com.company.oop.text;

public class Word {
    private String word;





    @Override
    public String toString() {
        return "Word{" +
                "word='" +  word + '\'' +
                '}';
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
