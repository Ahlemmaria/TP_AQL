package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuadraticEquationTest {

    @Test(expected = IllegalArgumentException.class)
    public void testZeroCoefficientA() {
        QuadraticEquation.solve(0, 2, 3);
    }

    @Test
    public void testNoRealRoots() {
        assertNull(QuadraticEquation.solve(1, 2, 3));
    }

    @Test
    public void testOneRealRoot() {
        assertArrayEquals(new double[]{-1}, QuadraticEquation.solve(1, 2, 1), 0);
    }

    @Test
    public void testTwoRealRoots() {
        double[] expected = {-2, -3};
        assertArrayEquals(expected, QuadraticEquation.solve(1, 5, 6), 0);
    }
}
