package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class CountLettersTest {

    @Test

    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }
    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
}