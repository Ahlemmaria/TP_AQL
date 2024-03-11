package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Palindrome_modTest {

    @Test(expected = NullPointerException.class)
    public void testNullString() {
        Palindrome_mod.isPalindrome(null);
    }

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome_mod.isPalindrome(""));
    }

    @Test
    public void testPalindrome() {
        assertTrue(Palindrome_mod.isPalindrome("kayak"));
        assertTrue(Palindrome_mod.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome_mod.isPalindrome("hello"));
        assertFalse(Palindrome_mod.isPalindrome("world"));
    }
}
