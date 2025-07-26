package MyCollections;

public class ArrayProblems {
    public static int findMax(int[] input) {
        if (input == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (input.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = input[0];

        for (int n : input) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}
