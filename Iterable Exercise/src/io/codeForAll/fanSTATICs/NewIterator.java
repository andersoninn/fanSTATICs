package io.codeForAll.fanSTATICs;

import java.util.Iterator;

public class NewIterator<E> implements Iterator<E> {

    private int firstPosition;
    private int lastPosition;

    public NewIterator(int firstPosition , int lastPosition){
        this.firstPosition = firstPosition;
        this.lastPosition = lastPosition;
    }

    @Override
    public boolean hasNext() {
        while (next() != null){
            return true;
        }
        return false;
    }

    @Override
    public E next() {
        firstPosition;
        return element;
    }
}
