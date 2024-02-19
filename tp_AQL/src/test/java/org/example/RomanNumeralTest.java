package org.example;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Assertions;


public class RomanNumeralTest {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);
    }

}