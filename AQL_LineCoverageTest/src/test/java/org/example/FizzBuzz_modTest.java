package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzz_modTest {

    @Test
    public void testFizzBuzz_PositiveNumberNotDivisible() {
        assertEquals("7", FizzBuzz_mod.fizzBuzz(7));
    }

    @Test
    public void testFizzBuzz_PositiveNumberDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz_mod.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzz_PositiveNumberDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz_mod.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzz_PositiveNumberDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz_mod.fizzBuzz(30));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzz_NegativeNumber() {
        FizzBuzz_mod.fizzBuzz(-1);
    }
}
