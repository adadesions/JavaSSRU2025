package MyCollections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayProblemsTest {
    @Test
    public void testAllPositiveCase() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 5;
        assertEquals(5, ArrayProblems.findMax(input));
    }

    @Test
    public void testAllNegativeCase() {
        int[] input = {-5, -2, -3, -9, -3};
        int expected = -2;
        assertEquals(expected, ArrayProblems.findMax(input));
    }

    @Test
    public void testMixedCase() {
        int[] input = {0, -1, 10, 7};
        int expected = 10;
        assertEquals(expected, ArrayProblems.findMax(input));
    }

    @Test
    public void testSingleElement() {
        int[] input = {42};
        int expected = 42;
        assertEquals(expected, ArrayProblems.findMax(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int expected = Integer.MIN_VALUE; // Assuming the method returns Integer.MIN_VALUE for empty arrays
        assertEquals(expected, ArrayProblems.findMax(input));
    }

    @Test
    public void testNullArray() {
        int[] input = null;
        assertThrows(IllegalArgumentException.class, () -> ArrayProblems.findMax(input)
        , "Input array cannot be null");
    }
}
