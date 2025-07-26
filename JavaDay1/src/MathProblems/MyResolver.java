package MathProblems;

public class MyResolver {
    public static int multipleOf3or5() {
        int result = 0;

//        for (int i = 1; i < 1000; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                result += i;
//            }
//        }
        int i = 0;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
            i++;
        }

        System.out.printf("Sum of multiples of 3 or 5 below 1000: %d%n", result);
        return result;
    }

    public static void evenFibonacciNumbers() {
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

    public static void largestPrimeFactor(long num) {
        System.out.printf("Largest prime factor of %d ", num);
        int factor = 2;
        int counter = 0;

        while (num > 1) {
            if (num % factor == 0) {
                num = num / factor;
            } else {
                factor++;
            }

            counter++;
        }

        System.out.printf(": %d%n", factor);
        System.out.printf("Total iterations: %d%n", counter);
    }
}
