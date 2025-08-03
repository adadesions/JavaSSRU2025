package StackProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixValidationTest {
    @Test
    public void testValidPrefixExpressionCase1() {
        String expression = "+ 3 4";
        String expected = "Valid";
        String actual = PrefixValidation.isValidPrefix(expression);
        assertEquals(expected, actual, "The expression should be valid as it has two operands and one operator.");
    }

    @Test
    public void testValidPrefixExpressionCase2() {
        String expression = "* + 2 3 4";
        String expected = "Valid";
        String actual = PrefixValidation.isValidPrefix(expression);
        assertEquals(expected, actual, "The expression should be valid as it has three operands and two operators.");
    }

    @Test
    public void testValidPrefixExpressionCase3() {
        String expression = "+ * 2";
        String expected = "InValid";
        String actual = PrefixValidation.isValidPrefix(expression);
        assertEquals(expected, actual, "The expression should be invalid as it has only one operand and one operator.");
    }

    @Test
    public void testValidPrefixExpressionCase4() {
        String expression = "+ a * b";
        String expected = "InValid";
        String actual = PrefixValidation.isValidPrefix(expression);
        assertEquals(expected, actual, "The expression should be invalid as it has only one operand and one operator.");
    }

    @Test
    public void testValidPrefixExpressionCase5() {
        String expression = "+ a * 2 b";
        String expected = "Valid";
        String actual = PrefixValidation.isValidPrefix(expression);
        assertEquals(expected, actual, "The expression should be valid as it has two operands and one operator.");
    }

    @Test
    public void testValidPrefixExpressionCase6() {
        String expression = "- + a b * 3 4";
        String expected = "Valid";
        String actual = PrefixValidation.isValidPrefix(expression);
        assertEquals(expected, actual, "The expression should be valid as it has four operands and three operators.");
    }
}
