package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanSumProblemTest {
    @Test
    public void testSmallTrueCases() {
        assertTrue(CanSumProblem.canSum(7, new int[]{2, 3}));
        assertTrue(CanSumProblem.canSum(7, new int[]{5, 3, 4, 7}));
        assertTrue(CanSumProblem.canSum(8, new int[]{2, 3, 5})); // 3+5
    }

    @Test
    public void testSmallFalseCases() {
        assertFalse(CanSumProblem.canSum(7, new int[]{2, 4}));
        assertFalse(CanSumProblem.canSum(1, new int[]{2, 3}));
        assertFalse(CanSumProblem.canSum(9, new int[]{5, 7})); // No combo
    }

    @Test
    public void testSingleNumberMatch() {
        assertTrue(CanSumProblem.canSum(4, new int[]{4}));
        assertTrue(CanSumProblem.canSum(12, new int[]{4}));

        assertFalse(CanSumProblem.canSum(7, new int[]{4}));
    }

    @Test
    public void testRepetitionAllowed() {
        assertTrue(CanSumProblem.canSum(8, new int[]{2}));  // 2+2+2+2
        assertFalse(CanSumProblem.canSum(7, new int[]{2})); // can't reach
    }

    @Test
    public void testLargeInputFalse() {
        assertFalse(CanSumProblem.canSum(300, new int[]{7, 14})); // Classic test
    }

    @Test
    public void testLargeInputTrue() {
        assertTrue(CanSumProblem.canSum(3000, new int[]{7, 14, 1})); // With 1 included
    }

    @Test
    public void testEdgeCases() {
        assertFalse(CanSumProblem.canSum(0, new int[]{})); // 0 is trivially reachable
        assertFalse(CanSumProblem.canSum(1, new int[]{})); // No numbers to use
    }
}
