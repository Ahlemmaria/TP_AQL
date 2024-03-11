package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzz_modTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeN() {
        FizzBuzz_mod.fizzBuzz(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroN() {
        FizzBuzz_mod.fizzBuzz(0);
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz_mod.fizzBuzz(15));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz_mod.fizzBuzz(9));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz_mod.fizzBuzz(25));
    }

    @Test
    public void testNumber() {
        assertEquals("7", FizzBuzz_mod.fizzBuzz(7));
    }
}
