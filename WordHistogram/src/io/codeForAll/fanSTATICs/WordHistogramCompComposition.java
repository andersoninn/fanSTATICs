package io.codeForAll.fanSTATICs;

import java.util.Map;

public class WordHistogramCompComposition implements Map<String, Integer> {

    private String STRING;


    public WordHistogramCompComposition(String STRING){
            this.STRING = STRING;
    }


    @Override
    public int size() {
        return STRING.length();
    }

    @Override
    public Integer get(Object key) {
        return null;
    }
}
