package StackProblems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertPrefixToPostfixProblemTest {
    @Test
    public void testConvertPrefixToPostfixCase1() {

        String expression = "+ 2 3";
        String expected = "2 3 +";
        String actual = ConvertPrefixToPostfixProblem.StringConvert(expression);

        assertEquals(expected, actual, "The converted postfix expression should be '2 3 +'");
    }

    @Test
    public void testConvertPrefixToPostfixCase2() {

        String expression = "* + 1 2 3";
        String expected = "1 2 + 3 *";
        String actual = ConvertPrefixToPostfixProblem.StringConvert(expression);

        assertEquals(expected, actual, "The converted postfix expression should be '1 2 + 3 *'");
    }

    @Test
    public void testConvertPrefixToPostfixCase3() {

        String expression = "/ * + 1 2 3 - 4 2";
        String expected = "1 2 + 3 * 4 2 - /";
        String actual = ConvertPrefixToPostfixProblem.StringConvert(expression);

        assertEquals(expected, actual, "The converted postfix expression should be '1 2 + 3 * 4 2 - /'");
    }
}