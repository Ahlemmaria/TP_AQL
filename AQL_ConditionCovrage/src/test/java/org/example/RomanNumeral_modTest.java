package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumeral_modTest {

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeLowerBound() {
        RomanNumeral_mod.toRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeUpperBound() {
        RomanNumeral_mod.toRoman(4000);
    }

    @Test
    public void testRomanRepresentation() {
        assertEquals("X", RomanNumeral_mod.toRoman(10));

    }
}
