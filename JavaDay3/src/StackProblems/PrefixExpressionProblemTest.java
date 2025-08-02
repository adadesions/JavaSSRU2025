package StackProblems;

//5. Evaluate Prefix Expression
// Write a program to evaluate a prefix expression with only +, -, *, / operators.

//Case 1
//Input : + 2 3
//Output : 5

//Case 2
//Input : - * + 2 3 4 6
//
//Output : 14
//Logic: ((2 + 3) * 4) - 6


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixExpressionProblemTest {
    @Test
    public void testEvaluatePrefixExpressionCase1() {
        String expression = "+ 2 3";
        int expected = 5;
        int actual = PrefixExpressionProblem.evaluate(expression);
        assertEquals(expected, actual, "The evaluated result of the prefix expression should be 5");
    }

    @Test
    public void testEvaluatePrefixExpressionCase2() {
        String expression = "- * + 2 3 4 6";
        int expected = 14;
        int actual = PrefixExpressionProblem.evaluate(expression);
        assertEquals(expected, actual, "The evaluated result of the prefix expression should be 14");
    }
}
