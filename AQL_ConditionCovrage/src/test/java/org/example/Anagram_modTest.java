package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Anagram_modTest {

    @Test(expected = NullPointerException.class)
    public void testNullStrings() {
        Anagram_mod.isAnagram(null, "hello");
    }

    @Test
    public void testDifferentLengthStrings() {
        assertFalse(Anagram_mod.isAnagram("chien", "nichee"));
    }

    @Test
    public void testAnagrams() {
        assertTrue(Anagram_mod.isAnagram("chien", "niche"));

    }

    @Test
    public void testNonAnagrams() {
        assertFalse(Anagram_mod.isAnagram("hello", "world"));
    }

    @Test
    public void testAnagramsWithDifferentCase() {
        assertTrue(Anagram_mod.isAnagram("Listen", "silent"));
        assertTrue(Anagram_mod.isAnagram("Debit Card", "Bad Credit"));
    }
}
