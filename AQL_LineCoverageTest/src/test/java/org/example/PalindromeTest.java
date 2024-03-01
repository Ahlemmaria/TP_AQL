package org.example;

import static org.junit.Assert.*;

import org.example.Palindrome;
import org.junit.*;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
        assertTrue(Palindrome.isPalindrome("“kayak"));
        assertFalse(Palindrome.isPalindrome("raadar"));
        assertTrue(Palindrome.isPalindrome(""));
        assertFalse(Palindrome.isPalindrome("123456"));

    }
    @Test(expected = NullPointerException.class)
    public void testIsPalindromeNullString() {
        Palindrome.isPalindrome(null);
    }

}
