package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Anagram_modTest {

    @Test(expected = NullPointerException.class)
    public void testNullStrings() {
        Anagram_mod.isAnagram(null, "listen");
    }

    @Test
    public void testAnagramBranch() {
        assertFalse(Anagram_mod.isAnagram("hello", "world"));
        assertFalse(Anagram_mod.isAnagram("hello!", "world"));
        assertTrue(Anagram_mod.isAnagram("chien", "niche"));

    }



}
