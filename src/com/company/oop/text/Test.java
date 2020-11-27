package com.company.oop.text;
import java.io.File;

public class Test {
    public static void main(String[]args){
        String path = "/home/vadim/test";
        Sentence sentence = new Sentence();
        File file = new File(path);
        PartOfText text = (PartOfText) new Sentence();
        System.out.println(text.print(sentence));

    }
}
