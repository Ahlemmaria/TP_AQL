package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzz_modTest {

    @Test(expected = IllegalArgumentException.class)
    public void testZeroInput() {
        FizzBuzz_mod.fizzBuzz(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        FizzBuzz_mod.fizzBuzz(-15);
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz_mod.fizzBuzz(15));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz_mod.fizzBuzz(3));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz_mod.fizzBuzz(5));
    }

    @Test
    public void testNonFizzBuzz() {
        assertEquals("1", FizzBuzz_mod.fizzBuzz(1));
        assertEquals("2", FizzBuzz_mod.fizzBuzz(2));

    }
}
