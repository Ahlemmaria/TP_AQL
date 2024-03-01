package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz_PositiveNumberNotDivisible() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testFizzBuzz_PositiveNumberDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzz_PositiveNumberDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzz_PositiveNumberDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzz_NegativeNumber() {
        FizzBuzz.fizzBuzz(-1);
    }
}
