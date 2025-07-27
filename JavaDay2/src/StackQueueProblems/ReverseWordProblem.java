package StackQueueProblems;

import java.util.Stack;

public class ReverseWordProblem {
    public static String solveReverseWord(String input) {
        Stack<Character> revStack = new Stack<>();

        for (char c : input.toCharArray()) {
            revStack.push(c);
        }

        StringBuilder result = new StringBuilder();
        while (!revStack.isEmpty()) {
            result.append(revStack.pop());
        }

        return result.toString();
    }
}

