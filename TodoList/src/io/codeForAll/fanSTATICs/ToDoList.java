package io.codeForAll.fanSTATICs;

// Biblioteca

import java.util.Comparator;
import java.util.PriorityQueue;

public class ToDoList {
    private PriorityQueue<Task> queue = new PriorityQueue<>();

    public void add(Importance importance, int priority, String item) {
        queue.add(new Task(importance, priority, item));
    }

    public Task remove() {
        return queue.remove();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}

