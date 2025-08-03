package Sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    @Test
    public void testMergeSort() {
        // Example test case for MergeSort
        int[] input = {38, 27, 43, 3, 9, 82, 10};
        int[] expected = {3, 9, 10, 27, 38, 43, 82};

        MergeSort.mergeSort(input);
        int[] actual = input;
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual: " + Arrays.toString(actual));

        assertArrayEquals(expected, actual, "The array should be sorted in ascending order using Merge Sort.");
    }
}
