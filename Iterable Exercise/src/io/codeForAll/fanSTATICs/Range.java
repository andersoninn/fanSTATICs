package io.codeForAll.fanSTATICs;

import java.util.Iterator;

public class Range implements Iterable<E>{
    private int n1;
    private int n2;

    public Range(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }


    @Override
    public NewIterator<E> iterator() {



        return new NewIterator<E>(this.n1, this.n2);
    }
}

