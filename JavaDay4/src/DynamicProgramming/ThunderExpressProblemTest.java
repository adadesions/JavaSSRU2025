package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThunderExpressProblemTest {
    @Test
    public void testExactMatchSimple() {
        assertEquals(2, ThunderExpressProblem.minContainers(new int[]{500}, 1000));
    }

    @Test
    public void testMultipleOptionsMinimized() {
        assertEquals(2, ThunderExpressProblem.minContainers(new int[]{200, 300, 500}, 1000)); // 500+500
    }

    @Test
    public void testImpossibleCase() {
        assertEquals(-1, ThunderExpressProblem.minContainers(new int[]{400, 800}, 1000)); // 400+600 = 1000, but no reuse of 500
    }

    @Test
    public void testZeroWeight() {
        assertEquals(0, ThunderExpressProblem.minContainers(new int[]{200, 300}, 0)); // No weight, no containers
    }

    @Test
    public void testSingleContainer() {
        assertEquals(1, ThunderExpressProblem.minContainers(new int[]{750}, 750));
    }

    @Test
    public void testGreedyFailsButDPWorks() {
        assertEquals(3, ThunderExpressProblem.minContainers(new int[]{9, 6, 1}, 11)); // Greedy takes 9+1+1 (3), but not fewer
    }

    @Test
    public void testWithRepeatedUse() {
        assertEquals(4, ThunderExpressProblem.minContainers(new int[]{200}, 800)); // 200 x 4
    }

    @Test
    public void testLargeInputEfficiently() {
        assertEquals(4, ThunderExpressProblem.minContainers(new int[]{250, 400, 500}, 2000)); // 500x4
    }

    @Test
    public void testPrimeNumbers() {
        assertEquals(3, ThunderExpressProblem.minContainers(new int[]{3, 7, 11}, 21)); // 7+7+7 or 3x7
    }
}
