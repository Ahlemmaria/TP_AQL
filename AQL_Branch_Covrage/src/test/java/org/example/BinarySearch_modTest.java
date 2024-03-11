package org.example;

import static org.junit.Assert.*;

import org.example.BinarySearch_mod;
import org.junit.Test;

public class BinarySearch_modTest {

    @Test(expected = NullPointerException.class)
    public void testNullArray() {
        BinarySearch_mod.binarySearch(null, 5);
    }

    @Test
    public void testElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch_mod.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch_mod.binarySearch(array, 6));
    }
}
