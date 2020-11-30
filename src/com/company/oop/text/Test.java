package com.company.oop.text;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[]args)  {
        File file = new File( "/home/vadim/test.txt" );
        List<String> list = new ArrayList<>();
        try ( Scanner scanner = new Scanner( file ) ) {
            while ( scanner.hasNext() ) {
                Word word = new Word();
                Sentence sentence = new Sentence();

                String line = scanner.next();
                word.setWord(line);
                sentence.add(word);

                list.add(word.getWord());
                //System.out.println( list );
                System.out.println(sentence);
            }
        } catch ( FileNotFoundException e ) {
            e.printStackTrace();
        }
        System.out.println(list);


    }
}

