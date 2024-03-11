package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Palindrome_modTest {

    @Test
    public void testNullString() {
        try {
            Palindrome_mod.isPalindrome(null);
            fail("Expected a NullPointerException to be thrown");
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testPalindromeBranch() {
        assertFalse(Palindrome_mod.isPalindrome("hello"));
        assertTrue(Palindrome_mod.isPalindrome("kayak"));

    }
}
