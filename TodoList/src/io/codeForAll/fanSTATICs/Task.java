package io.codeForAll.fanSTATICs;

public class Task implements Comparable<Task> {
    public Importance importance;
    public int priority;
    public String item;

    public Task(Importance importance, int priority, String item) {
        this.importance = importance;
        this.priority = priority;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Importance: " + importance + " priority: " + priority + " " + item;
    }

    @Override
    public int compareTo(Task o) {

        if (importance.compareTo(o.importance) == 0) {
            return priority - o.priority;
        }
        return importance.compareTo(o.importance);
    }
}



