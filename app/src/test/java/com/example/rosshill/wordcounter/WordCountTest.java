package com.example.rosshill.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCountTest {

    WordCount words;

    @Before
    public void before() {
        words = new WordCount("If credit's what matters, I'll take credit");
    }

    @Test
    public void countWords()  {
        assertEquals(7, words.getCount());
    }
}