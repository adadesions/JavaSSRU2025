import MathProblems.MyResolver;

public class Main {
    private static float pythagoreanTheorem(float a, float b) {
        return (float) Math.sqrt(a * a + b * b);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static void printMinNumber(double v1, double v2) {
        double a = v1;
        double b = v2;
        double m = 0;

        String r = "The minimum of numbers: %.2f and %.2f is %.2f";

        m = Math.min(a, b);

        String result = String.format(r, a, b, m);
        System.out.println(result);
    }

    public static void main(String[] args) {
        float c = pythagoreanTheorem(3, 4);
        System.out.println("The hypotenuse is: " + c);

        boolean isEven = isEven(22);
        System.out.println("Is 22 even? : " + isEven);

        printMinNumber(4.5, 3.2);

        MyResolver.multipleOf3or5();

        // Solve Even Fibonacci Numbers
        MyResolver.EvenFibonacciNumbers();
    }
}