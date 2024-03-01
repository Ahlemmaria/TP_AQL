package org.example;

import static org.junit.Assert.*;
import org.junit.*;

public class Anagram_modTest {

    @Test
    public void testIsAnagram() {
        assertTrue(Anagram_mod.isAnagram("chien", "niche"));

    }

    @Test
    public void testIsNotAnagram() {
        assertFalse(Anagram_mod.isAnagram("chiennne", "niche"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsAnagramNullString1() {
        Anagram_mod.isAnagram(null, "test");
    }

    @Test
    public void testIsAnagramLineCoverage() {
        assertFalse(Anagram_mod.isAnagram("A", "B"));
    }




    @Test
    public void testEmptyCountArray() {
        int[] count = new int[0];
        assertTrue(Anagram_mod.isAnagram("chien", "niche"));
    }
}
