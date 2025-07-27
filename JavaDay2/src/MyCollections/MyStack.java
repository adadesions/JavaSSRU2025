package MyCollections;

import java.util.Stack;

public class MyStack {
    private final Stack<String> bookStack;

    public MyStack() {
        this.bookStack = new Stack<>();
    }

    public void pushBook(String book) {
        bookStack.push(book);
    }

    public String lookAtTopBook() {
        if (!bookStack.isEmpty()) {
            return bookStack.peek();
        } else {
            return "No books in the stack.";
        }
    }

    public String popBook() {
        if (!bookStack.isEmpty()) {
            return bookStack.pop();
        } else {
            return "No books to pop.";
        }
    }

    public void printStack() {
        if (bookStack.isEmpty()) {
            System.out.println("The book stack is empty.");
        } else {
            System.out.println("Books in the stack: " + bookStack);
        }
    }
}
