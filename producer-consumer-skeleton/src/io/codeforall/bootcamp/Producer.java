package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue;
import io.codeforall.bootcamp.bqueue.BQueue2;
import io.codeforall.bootcamp.bqueue.Pizza;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue2<Pizza> queue;
    private int elementNum;


    /**
     * @param queue      the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue2 queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;

    }

    @Override
    public synchronized void run() {
        while (elementNum > 0) {
            queue.offer(new Pizza());
            elementNum--;
        }
    }


}
