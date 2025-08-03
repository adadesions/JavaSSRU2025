package Sorting;

public class Recursion {
    public static int fibonacci(int n) {
        // F(N) = F(N-1) + F(N-2), N > 1
        // Base case: F(0) = 0, F(1) = 1
        // Halting condition: N < 0
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        // Base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive case
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int gcd(int a, int b) {
        //If b == 0, then gcd(a, b) = a
        //Otherwise: gcd(a, b) = gcd(b, a % b)

        System.out.println("Calculating gcd(" + a + ", " + b + ")");
        //  Base case: if b is 0
        if (b == 0){
            return a;
        }

        // Recursive case
        return gcd(b, a % b);
    }
}
