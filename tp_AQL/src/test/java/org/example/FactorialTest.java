package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorialForZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialForPositiveNumbers() {
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialForNegativeNumber() {
        Factorial.factorial(-1);
    }
}
