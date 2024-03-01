package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuadraticEquationTest {


    @Test(expected = IllegalArgumentException.class)
    public void testSolveZeroACoefficient() {
        QuadraticEquation.solve(0, 1, 2);
    }


    @Test
    public void testSolvePositiveDelta() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(2.0, result[0], 0.0001);
        assertEquals(1.0, result[1], 0.0001);
    }

    @Test
    public void testSolveZeroDelta() {
        double[] result = QuadraticEquation.solve(1, -2, 1);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(1.0, result[0], 0.0001);
    }

    @Test
    public void testSolveNegativeDelta() {
        double[] result = QuadraticEquation.solve(1, 1, 1);
        assertNull(result);
    }


}
