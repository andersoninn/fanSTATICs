package io.codeForAll.fanSTATICs;

public class Main {
    public static final String STRING = "test word words teste 1 10 1";

    public static void main(String[] args) {

        WordHistogramCompInheritance wordHistogram = new WordHistogramCompInheritance(STRING);
        System.out.println("MAP has " + wordHistogram.size() + " distinct words");

        for(String word: wordHistogram){
            System.out.println(word + " : " + wordHistogram.get(word));
        }
        System.out.println("========================");
    }
}
