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
}
