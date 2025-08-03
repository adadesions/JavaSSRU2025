import Sorting.Recursion;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.print(Recursion.fibonacci(i) + " ");
        }

        System.out.println();
        int gcd = Recursion.gcd(60, 36);
        System.out.println("\nGCD of 36 and 60 is: " + gcd);


    }
}