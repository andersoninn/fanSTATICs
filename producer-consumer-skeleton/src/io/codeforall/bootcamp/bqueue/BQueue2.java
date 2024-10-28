package io.codeforall.bootcamp.bqueue;

import java.util.LinkedList;

public class BQueue2<T> {
    int limit;
    LinkedList<Pizza> pizzasInQueue = new LinkedList<Pizza>();

    public BQueue2(int limit) {
        this.limit = limit;
    }

    public synchronized void offer(Object data) {

        while (pizzasInQueue.size() >= this.limit) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        pizzasInQueue.add((Pizza) data);
        System.out.println("Produziu " + pizzasInQueue.size());
        System.out.println(data.toString());
        notifyAll();
    }

    public synchronized void poll() {
        while (!pizzasInQueue.isEmpty()) {
            System.out.println("Comeu 1");
            pizzasInQueue.remove();
            System.out.println("Agora temos " + pizzasInQueue.size());
            notifyAll();
            
            if (pizzasInQueue.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int getSize() {
        return pizzasInQueue.size();
    }
}

