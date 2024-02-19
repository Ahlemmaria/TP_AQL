package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class RomanNumeral_ModTest {
    @Test
    public void singleNumber() {
        RomanNumeral_Mod roman = new RomanNumeral_Mod();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);    }
    @Test
    public void numberWithManyDigits() {
        RomanNumeral_Mod roman = new RomanNumeral_Mod();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);    }
}