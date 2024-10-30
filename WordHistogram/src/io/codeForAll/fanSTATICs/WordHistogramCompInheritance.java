package io.codeForAll.fanSTATICs;

import java.util.*;


public class WordHistogramCompInheritance implements Iterable<String> {
    private String STRING;
    private Map<String, Integer> map = new HashMap<>();

    public WordHistogramCompInheritance(String STRING) {
        this.STRING = STRING;
        mapFor();
    }

    public void mapFor() {
        String[] wordArray = STRING.split(" ");

        for (int i = 0; i < wordArray.length; i++) {

            //  KEY, VALOR
            // percorre o array "wordArray" na posição "i"


            if (map.containsKey(wordArray[i])) {
                map.put(wordArray[i], map.get(wordArray[i])+1);

            } else {
                map.put(wordArray[i], 1);
            }
        }
    }

    public int size() {
        return map.size();
    }

    public Integer get(String word) {
        return map.get(word);
    }

    @Override
    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }

}
