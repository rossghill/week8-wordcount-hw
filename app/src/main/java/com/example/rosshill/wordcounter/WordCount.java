package com.example.rosshill.wordcounter;

/**
 * Created by rosshill on 22/01/2018.
 */

public class WordCount {

    String words;

    public WordCount(String words){
        this.words = words;
    }

    public int getCount() {
        return words.length();
    }
}
