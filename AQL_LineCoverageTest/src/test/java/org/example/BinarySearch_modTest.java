package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearch_modTest {

    @Test
    public void testBinarySearch_NullArray() {
        // Test when array is null
        assertThrows(NullPointerException.class, () -> BinarySearch_mod.binarySearch(null, 5));
    }

    @Test
    public void testBinarySearch_ElementNotFound() {
        // Test when element is not found
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch_mod.binarySearch(array, 6));
    }



    @Test
    public void testBinarySearch_ElementFirstInArray() {
        // Test when element is first in array
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(1, BinarySearch_mod.binarySearch(array, 2));
    }

    @Test
    public void testBinarySearch_ElementLastInArray() {
        // Test when element is last in array
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, BinarySearch_mod.binarySearch(array, 4));
    }

    @Test
    public void testBinarySearch_ArrayWithSingleElement() {
        // Test when array has only one element
        int[] array = {5};
        assertEquals(0, BinarySearch_mod.binarySearch(array, 5));
    }

    @Test
    public void testBinarySearch_ArrayWithEvenNumberOfElements_ElementInMiddle() {
        // Test when array has even number of elements and element is in the middle
        int[] array = {1, 3, 5, 7, 9, 11};
        assertEquals(2, BinarySearch_mod.binarySearch(array, 5));
    }

    @Test
    public void testBinarySearch_ArrayWithOddNumberOfElements_ElementInMiddle() {
        // Test when array has odd number of elements and element is in the middle
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(3, BinarySearch_mod.binarySearch(array, 4));
    }
}
