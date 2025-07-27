package MyCollections;

import java.util.LinkedList;

public class MyQueue {
    private final LinkedList<String> queue;

    public MyQueue() {
        this.queue = new LinkedList<String>();
    }

    public void enqueue(String item) {
        queue.addLast(item);
    }

    public String dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.poll();
    }

    public boolean NotEmpty() {
        return !queue.isEmpty();
    }
}
