package io.codeforall.bootcamp;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Integer range iterator
 */
public class Range implements Iterable<Integer> {

    private int min;
    private int max;

    private boolean[] removed;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;

        //The size of array is +1 to be inclusive of both min and max
        removed = new boolean[max - min + 1];
    }

    @Override
    public Iterator<Integer> iterator() {
        if (min < max) {
            return new FwdRangeIterator();
        }
        return new DRangeIterator();
    }

    // map
    // hasMap - mais rapido por transformar os objetos em números
    // Nested Class
    //


    private class FwdRangeIterator implements Iterator<Integer> {

        private int current;

        public FwdRangeIterator() {
            // start this iterator with the "current number" just before the min value.
            // You need to call next() to get the first element.
            System.out.println("max maior que min");
            current = min - 1;
        }

        @Override
        public boolean hasNext() {

            // check if the next number is removed.
            // if it is.... keep checking if the following numbers are removed.
            while (removedContains(current + 1)) {
                current++;
            }

            return current < max;
        }

        private boolean removedContains(int current) {
            // First we need to check if the current number above the max value
            return current <= max && removed[current - min];
        }

        @Override
        public Integer next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            current++;
            return current;
        }

        @Override
        public void remove() {

            // if you try to remove an element before calling next(), you will get a runtime exception (see Iterable:remove() description)
            if (current < min) {
                throw new IllegalStateException("You need to call next() at least once to remove an element.");
            }

            // if you try to call remove() consecutively you will get a runtime exception (see Iterable:remove() description)
            if (removedContains(current)) {
                throw new IllegalStateException("You cannot call remove() repeatedly");
            }
            removed[current - min] = true;
        }

    }

    private class DRangeIterator implements Iterator<Integer> {

        private int current;

        public DRangeIterator() {
            // start this iterator with the "current number" just before the min value.
            // You need to call next() to get the first element.
            System.out.println("min maior que o max");
            current = max + 1;
        }

        @Override
        public boolean hasNext() {

            // check if the next number is removed.
            // if it is.... keep checking if the following numbers are removed.
            while (removedContains(current - 1)) {
                current--;
            }

            return current > max;
        }

        private boolean removedContains(int current) {
            // First we need to check if the current number above the max value
            return current <= max && removed[current - min];
        }

        @Override
        public Integer next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            current++;
            return current;
        }

        @Override
        public void remove() {

            // if you try to remove an element before calling next(), you will get a runtime exception (see Iterable:remove() description)
            if (current < min) {
                throw new IllegalStateException("You need to call next() at least once to remove an element.");
            }

            // if you try to call remove() consecutively you will get a runtime exception (see Iterable:remove() description)
            if (removedContains(current)) {
                throw new IllegalStateException("You cannot call remove() repeatedly");
            }
            removed[current - min] = true;
        }

    }
}
/*
* class OuterClass {
*
*   private int min;
    private int max;

    //private boolean[] removed;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;

        //The size of array is +1 to be inclusive of both min and max
        //removed = new boolean[max - min + 1];
    }

    public Iterator method() {

        boolean variable = true;
        final int finalVariable = 1;

        class LocalClass implements Iterator {

            public int next() {
                return finalVariable;  // OK
            }

            public boolean hasNext() {
                return variable;  // COMPILE ERROR
            }
        }

        return new LocalClass();
    }
}
* */