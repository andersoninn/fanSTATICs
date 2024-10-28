package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue2;
import io.codeforall.bootcamp.bqueue.Pizza;
import io.codeforall.bootcamp.bqueue.BQueue;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue2<Pizza> queue;
    private int elementNum;


    /**
     * @param queue      the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue2 queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {
        while (queue.getSize() >= 0)
            queue.poll();
    }
}
