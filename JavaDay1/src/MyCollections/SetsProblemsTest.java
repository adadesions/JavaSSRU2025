package MyCollections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetsProblemsTest {
    @Test
    public void testSimpleSetProblem() {
        String[] input = {"Alice", "Bob", "Alice", "Charlie", "Bob", "David" , "Charlie"};
        Set<String> expect = new TreeSet<>(Arrays.asList(input));
        Set<String> actual = SetsProblems.simpleSetProblem(input);

        assertEquals(expect, actual, "Expected set does not match actual set");
    }
}
