package StackQueueProblems;

import MapProblems.WordCountProblem;
import MyCollections.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordProblemTest {
    @Test
    public void testReverseWord() {
        String input = "Game";
        String expected = "emaG";
        String actual = ReverseWordProblem.solveReverseWord(input);

        assertEquals(expected, actual, "Reversed word does not match expected output");
    }
}
