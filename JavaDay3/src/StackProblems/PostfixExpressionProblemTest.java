package StackProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostfixExpressionProblemTest {
    @Test
    public void testEvaluatePostfixExpressionCase1() {
        String expression = "5 6 + 2 *";
        int expected = 22;
        int actual = PostfixExpressionProblem.evaluate(expression);
        assertEquals(expected, actual, "The evaluated result of the postfix expression should be 22");
    }

    @Test
    public void testEvaluatePostfixExpressionCase2() {
        String expression = "3 4 + 2 * 7 /";
        int expected = 2;
        int actual = PostfixExpressionProblem.evaluate(expression);
        assertEquals(expected, actual, "The evaluated result of the postfix expression should be 2");
    }

    @Test
    public void testEvaluatePostfixExpressionCase3() {
        String expression = "2 3 + 5 * 4 -";
        int expected = 21;
        int actual = PostfixExpressionProblem.evaluate(expression);
        assertEquals(expected, actual, "The evaluated result of the postfix expression should be 21");
    }
}
