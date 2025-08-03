package Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TowerOfHanoiTest {
    @Test
    public void testTowerOfHanoi() {
        int n = 10;
        int expected = TowerOfHanoi.minimumMoves(n);
        TowerOfHanoi.SolveTowerOfHanoi(n, "A", "B", "C");
        int actual = TowerOfHanoi.getMoves(); // Assuming you have a method to get the number of moves
        assertEquals(expected, actual, "The number of moves required to solve the Tower of Hanoi with 3 disks should be 7.");
    }
}
