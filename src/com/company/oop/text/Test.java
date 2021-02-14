package com.company.oop.text;

public class Test {
    public static void main(String[] args) {
        Word w0 = new Word("Hello");
        Word w1 = new Word("Vados");
        Word w2 = new Word("are");
        Word w3 = new Word("u");
        Word w4 = new Word("ok?");

        Sentence sentence = new Sentence();
        sentence.add(w0);
        sentence.add(w1);
        sentence.add(w2);
        sentence.add(w3);
        sentence.add(w4);


        Text text = new Text();
        text.setHead("Vadosymba");
        text.add(sentence);


        Print print = new Print();
        print.print(text);
    }

}
