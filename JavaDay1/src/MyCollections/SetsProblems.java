package MyCollections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetsProblems {
    // HashSet is a collection that does not allow duplicate elements.
    // LinkedHashSet maintains the insertion order.
    // TreeSet is a collection that sorts the elements in natural order or by a specified comparator.
    public static Set<String> simpleSetProblem(String[] input) {
        return new TreeSet<>(Arrays.asList(input));
    }
}
