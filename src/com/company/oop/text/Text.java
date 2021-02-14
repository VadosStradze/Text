package com.company.oop.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private List<Sentence> sentenceList;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    private String head;

    public Text() {
        this.sentenceList = new ArrayList<>();

    }


    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(List<Sentence> sentenceList) {
        this.sentenceList = sentenceList;
    }
    public void add(Sentence sentence) {
        sentenceList.add(sentence);
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentenceList=" + sentenceList +
                ", head='" + head + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(sentenceList, text.sentenceList) && Objects.equals(head, text.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentenceList, head);
    }
}
