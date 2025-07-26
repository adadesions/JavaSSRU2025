package MathProblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyResolverTest {

    @Test
    public void testMultipleOf3or5() {
        int expected = 233168; // Sum of multiples of 3 or 5 below 1000
        int actual = MyResolver.multipleOf3or5();

        assertEquals(expected, actual, "Sum of multiples of 3 or 5 below 1000 should be 233168");
    }
}
