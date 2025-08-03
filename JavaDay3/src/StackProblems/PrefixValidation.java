package StackProblems;

import java.util.Stack;

public class PrefixValidation {
    public static String isValidPrefix(String expression) {
        String[] tokens = expression.trim().split("\\s+");
        Stack<String> stack = new Stack<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (isOperator(token)) {
                if (stack.size() < 2) {
                    return "InValid";
                }

                stack.pop();
                stack.pop();
                stack.push("operand");
            }
            else {
                if (!isNumeric(token) && !isVariable(token)) {
                    return "InValid";
                }

                stack.push(token);
            }
        }
        return stack.size() == 1 ? "Valid" : "InValid";
    };

    private static boolean isOperator(String token) {
        return "+-*/%^".contains(token);
    }

    private static boolean isNumeric(String token) {
        return token.matches("-?\\d+");
    }

    private static boolean isVariable(String token) {
        return token.matches("[a-zA-Z]+");
    }
}
