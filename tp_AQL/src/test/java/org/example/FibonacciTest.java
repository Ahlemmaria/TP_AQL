package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciForZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonacciForOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacciForPositiveNumbers() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(13, Fibonacci.fibonacci(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciForNegativeNumber() {
        Fibonacci.fibonacci(-1);
    }


}
