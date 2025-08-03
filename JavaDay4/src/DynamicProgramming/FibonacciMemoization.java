package DynamicProgramming;

import java.util.HashMap;

public class FibonacciMemoization {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int fn = fib(n - 1) + fib(n - 2);
        memo.put(n, fn);

        return fn;
    }
}
