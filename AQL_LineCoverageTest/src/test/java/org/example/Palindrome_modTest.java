package org.example;

import static org.junit.Assert.*;

import org.example.Palindrome;
import org.junit.*;

public class Palindrome_modTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome_mod.isPalindrome("Kayak"));
        assertFalse(Palindrome_mod.isPalindrome(("kayakk")));


    }
    @Test(expected = NullPointerException.class)
    public void testIsPalindromeNullString() {
        Palindrome_mod.isPalindrome(null);
    }

}
