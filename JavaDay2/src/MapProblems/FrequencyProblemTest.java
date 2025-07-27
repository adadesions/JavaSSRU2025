package MapProblems;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyProblemTest {

    @Test
    public void testFrequencyProblem() {
        int[] inputArray = new int[] {1,2,2,3,1,2};

        HashMap<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(2, 3);
        expected.put(3, 1);
        HashMap<Integer, Integer> actual = FrequencyProblem.solveFrequencyProblem(inputArray);

        assertEquals(expected, actual, "Frequency map does not match expected output");
    }
}
