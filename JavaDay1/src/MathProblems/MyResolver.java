package MathProblems;

public class MyResolver {
    public static void multipleOf3or5() {
        int result = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }

        System.out.printf("Sum of multiples of 3 or 5 below 1000: %d%n", result);
    }

    public static void EvenFibonacciNumbers() {
        // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        int t0 = 1;
        int t1 = 2;
        int sum = 0;

        while (t0 <= 4000000) {
            if (t0 % 2 == 0) {
                sum += t0;
            }

            int nextTerm = t0 + t1;
            t0 = t1;
            t1 = nextTerm;
        }

        System.out.printf("Sum of even Fibonacci numbers below 4 million: %d%n", sum);
    }
}
