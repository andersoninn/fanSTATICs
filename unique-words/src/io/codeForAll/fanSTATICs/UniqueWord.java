package io.codeForAll.fanSTATICs;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueWord implements Iterable<String> {

    private String uniqueWord;

    public UniqueWord(String str) {
        this.uniqueWord = str;
        otherFor();
    }

    public HashSet<String> hashSet = new HashSet<>();

    public void otherFor() {
        String[] word = uniqueWord.split(" ");
        for (int i = 0; i < word.length; i++) {
            hashSet.add(word[i]);
        }
    }

    @Override
    public Iterator iterator() {
        return hashSet.iterator();
    }
}
