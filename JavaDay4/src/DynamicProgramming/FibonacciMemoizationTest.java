package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciMemoizationTest {
    @Test
    public void testFibonacciMemoization() {
        assertEquals(0, FibonacciMemoization.fib(0));
        assertEquals(1, FibonacciMemoization.fib(1));
        assertEquals(1, FibonacciMemoization.fib(2));
        assertEquals(2, FibonacciMemoization.fib(3));
        assertEquals(3, FibonacciMemoization.fib(4));
        assertEquals(5, FibonacciMemoization.fib(5));
        assertEquals(8, FibonacciMemoization.fib(6));
        assertEquals(13, FibonacciMemoization.fib(7));
        assertEquals(21, FibonacciMemoization.fib(8));
        assertEquals(34, FibonacciMemoization.fib(9));
        assertEquals(55, FibonacciMemoization.fib(10));

        // Test larger Fibonacci numbers n = 20
        assertEquals(6765, FibonacciMemoization.fib(20));

        // 2^20 = 1048576, so we can test a larger number
        // 20
    }
}
