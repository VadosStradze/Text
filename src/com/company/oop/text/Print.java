package com.company.oop.text;

public class Print {
    public void print(Text text) {
        System.out.println(text.getHead());
        for (Sentence sentence : text.getSentenceList()) {
            for (Word word : sentence.getWordList()) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

}
