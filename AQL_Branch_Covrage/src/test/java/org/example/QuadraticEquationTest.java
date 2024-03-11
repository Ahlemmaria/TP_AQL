package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadraticEquationTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAEqualToZero() {
        QuadraticEquation.solve(0, 2, 3);
    }

    @Test
    public void testDeltaLessThanZero() {
        assertNull(QuadraticEquation.solve(1, 2, 3));
    }

    @Test
    public void testDeltaEqualsZero() {
        double[] result = QuadraticEquation.solve(1, -2, 1);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(1.0, result[0], 0.0001);
    }

    @Test
    public void testDeltaGreaterThanZero() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(2.0, result[0], 0.0001);
        assertEquals(1.0, result[1], 0.0001);
    }
}
