package org.example;

import static org.junit.Assert.*;
import org.junit.*;

public class AnagramTest {

    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));

    }

    @Test
    public void testIsNotAnagram() {
        assertFalse(Anagram.isAnagram("chiennne", "niche"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsAnagramNullString1() {
        Anagram.isAnagram(null, "test");
    }


}
