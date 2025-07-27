package MapProblems;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountProblemTest {

    @Test
    public void testWordCount() {
        String[] WordInput = new String[] {
                "apple", "banana", "apple", "pine-apple", "Apple", "Banana"
        };

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);
        expected.put("banana", 2);
        expected.put("pine-apple", 1);

        HashMap<String, Integer> actual = WordCountProblem.solveWordCount(WordInput);
        assertEquals(expected, actual, "Word count map does not match expected output");
    }
}
