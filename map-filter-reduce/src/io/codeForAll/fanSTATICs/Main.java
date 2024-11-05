package io.codeForAll.fanSTATICs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        //Transforma a mensagem em uma Stream - array separado por " ".
        Stream<String> wordStream = Arrays.stream(message.split(" "));

        //Percorre a mensagem filtrando na stream as palavras que forem diferentes de "garbage" e depois usa o método joining para juntar as
        // palavras e formar uma nova stream sem as ocorrencias de "garbage", separando-as por " ". (joining é o contrário de split).

        String filteredMessage = wordStream.filter(word -> !word.equals("garbage")).collect(Collectors.joining(" "));

        System.out.println(filteredMessage.toUpperCase());

    }
}
