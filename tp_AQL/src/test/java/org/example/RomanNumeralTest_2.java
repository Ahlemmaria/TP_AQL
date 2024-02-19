package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest_2 {

 @Test
        public void numberWithManyDigits() {
            RomanNumeral roman = new RomanNumeral();
            int result = roman.convert("VIII");
            Assertions.assertEquals(8, result);
        }

    }

