import MathProblems.MyResolver;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
        MyResolver.evenFibonacciNumbers();

        // Solve Largest Prime Factor
        MyResolver.largestPrimeFactor(600851475143L);

        Set<String> superHeroes = new HashSet<>();

        superHeroes.add("Ironman");
        superHeroes.add("Hulk");
        superHeroes.add("Thor");
        superHeroes.add("Captain America");
        superHeroes.add("Ironman"); // Duplicate, will not be added

        System.out.println("Superheroes: " + superHeroes);

        superHeroes.remove("Ironman");
        System.out.println("After removing Ironman: " + superHeroes);

        // Check if a superhero exists
        boolean exists = superHeroes.contains("Hulk");
        System.out.println("Does Hulk exist in the set? " + exists);

        // Iterate through the set
        for (String hero : superHeroes) {
            System.out.printf("%s_SSRU\n", hero);
        }

        Set<String> books = new LinkedHashSet<>();
        books.add("The Catcher in the Rye");
        books.add("To Kill a Mockingbird");
        books.add("Eat the Frog");
        books.add("The Great Gatsby");

        System.out.println("Books in insertion order: " + books);


        Set<String> students = new TreeSet<>();
        students.add("Linus Torvalds");
        students.add("Ada Lovelace");
        students.add("Alan Turing");
        students.add("Grace Hopper");
        students.add("Bjarne Stroustrup");
        students.add("001 Peter Parker");

        System.out.println("Students in sorted order: " + students);
    }
}