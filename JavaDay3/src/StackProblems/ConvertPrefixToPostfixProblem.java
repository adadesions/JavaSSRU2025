package StackProblems;

import java.util.Stack;

public class ConvertPrefixToPostfixProblem {

    public static String StringConvert(String expression) {
        String[] tokens = expression.trim().split("\\s+");
        Stack<String> stack = new Stack<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (isOperator(token)) {
                String num1 = stack.pop();
                String num2 = stack.pop();

                String result = num1 + " " + num2 + " " + token;
                stack.push(result);

                System.out.println(result);
            } else {
                stack.push(token);
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return "+-*/%^".contains(token);
    }

}
