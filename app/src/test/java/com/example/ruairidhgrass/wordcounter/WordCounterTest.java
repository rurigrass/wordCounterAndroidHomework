package com.example.ruairidhgrass.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter();
    }

    @Test
    public void canGetWord() {
        wordCounter.setWord("hello");
        assertEquals("hello", wordCounter.getWord());
    }

    @Test
    public void getLetterCount() {
        wordCounter.setWord("hello");
        assertEquals(5, wordCounter.getLetterCount("hello"));
    }

    @Test
    public void getWordCount() {
        wordCounter.setWord("hello");
        assertEquals(1, wordCounter.getWordCount("hello"));
    }
}

