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


    // Tests for maxSubArray method
    @Test
    public void testAllPositiveMaxSubArray() {
        int numLv = 5;
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {15, 1, 5};
        int[] actual = ArrayProblems.maxSubArray(numLv, input);
        assertArrayEquals(expected, actual, "Max subarray sum should be 15 with start index 1 and end index 5");
    }

    @Test
    public void testAllNegativeMaxSubArray() {
        int numLv = 5;
        int[] input = {-1, -2, -3, -4, -5};
        int[] expected = {-1, 1, 1}; // Assuming the max subarray is just the single largest element
        int[] actual = ArrayProblems.maxSubArray(numLv, input);
        assertArrayEquals(expected, actual, "Max subarray sum should be -1 with start index 1 and end index 1");
    }

    @Test
    public void testMixedMaxSubArray() {
        int numLv = 9;
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] expected = {6, 4, 7};
        int[] actual = ArrayProblems.maxSubArray(numLv, input);
        assertArrayEquals(expected, actual, "Max subarray sum should be 6 with start index 4 and end index 7");
    }

    @Test
    public void testMixedZeroMaxSubArray() {
        int numLv = 6;
        int[] input = {0, 0, 5, 0, 0, 7};
        int[] expected = {12, 1, 6}; // Assuming the max subarray is from index 2 to 5
        int[] actual = ArrayProblems.maxSubArray(numLv, input);
        assertArrayEquals(expected, actual, "Max subarray sum should be 12 with start index 1 and end index 6");
    }

    @Test
    public void TestZeroAndNegativeMaxSubArray() {
        int numLv = 6;
        int[] input = {0, -1, -2, 0, -3, 0};
        int[] expected = {0, 1, 1}; // Assuming the max subarray is just the single largest element which is 0
        int[] actual = ArrayProblems.maxSubArray(numLv, input);
        assertArrayEquals(expected, actual, "Max subarray sum should be 0 with start index 1 and end index 1");
    }

   @Test
   public void TestMultipleMaximaMaxSubArray() {
        int numLv = 8;
        int[] input = {4, -1, 2, -1, 4, -1, 2, -1};
        int[] expected = {9, 1, 7};
        int[] actual = ArrayProblems.maxSubArray(numLv, input);
        assertArrayEquals(expected, actual, "Max subarray sum should be 4 with start index 1 and end index 1");
    }

}
