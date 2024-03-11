package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeral_modTest {

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeLowerBound() {

        RomanNumeral_mod RomanNumeral = new RomanNumeral_mod();
        RomanNumeral.toRoman(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfRangeUpperBound() {
        RomanNumeral_mod RomanNumeral = new RomanNumeral_mod();
        RomanNumeral.toRoman(4000);
    }

    @Test
    public void testRomanRepresentation() {
        RomanNumeral_mod RomanNumeral = new RomanNumeral_mod();
        assertEquals("III", RomanNumeral.toRoman(3));
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("MMMDCCCLXXXVIII", RomanNumeral.toRoman(3888));
    }
}
