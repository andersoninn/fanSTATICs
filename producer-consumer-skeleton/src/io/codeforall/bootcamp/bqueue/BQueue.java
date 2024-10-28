package io.codeforall.bootcamp.bqueue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    int limit;
    int inQueue;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {
        try {
            this.limit = limit;
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public void offer(T data) {
        try {
            inQueue++;
            T pizza = (T) new Pizza();
            System.out.println("limit " + limit + " / " + "pizza produzida " + inQueue);
            System.out.println(pizza.toString());

        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public T poll() {
        try {
            if(inQueue > 0){
            inQueue--;
            }

        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {
        return inQueue;
    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {
        return limit;
    }

}
