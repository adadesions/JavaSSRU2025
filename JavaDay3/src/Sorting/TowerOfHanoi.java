package Sorting;

import StackProblems.PrefixValidation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TowerOfHanoi {
    private static int moves = 0;

    public static void SolveTowerOfHanoi(int n, String from_rod, String aux_rod, String to_rod) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + from_rod + " to " + to_rod);
            moves++;
            return;
        }

        // From to Aux
        SolveTowerOfHanoi(n - 1, from_rod, to_rod, aux_rod);
        System.out.println("Move disk " + n + " from " + from_rod + " to " + to_rod);
        moves++;

        SolveTowerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static int getMoves() {
        return moves;
    }

    public static int minimumMoves(int n) {
        System.out.println("Minimum number of moves required to solve Tower of Hanoi with " + n + " disks: " + moves);
        return (int) Math.pow(2, n) - 1;
    }
}
