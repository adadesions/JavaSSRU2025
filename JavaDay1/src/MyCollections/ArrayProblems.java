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

    public static int[] maxSubArray(int numLv, int[] input) {
        int maxLocal = input[0];
        int maxGlobal = input[0];

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < numLv; i++) {
            if (input[i] > maxLocal + input[i]) {
                maxLocal = input[i];
                start = i;
            } else {
                maxLocal += input[i];
            }

            if (maxLocal > maxGlobal) {
                maxGlobal = maxLocal;
                bestStart = start;
                bestEnd = i;
            }
        }

        return new int[]{maxGlobal, bestStart + 1, bestEnd + 1};
    }
}
