package com.company.oop.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> wordList;

    public Sentence() {
        this.wordList = new ArrayList<>();
    }

    public void add(Word word) {
        wordList.add(word);
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "wordList=" + wordList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(wordList, sentence.wordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordList);
    }
}
