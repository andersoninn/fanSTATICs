package io.codeForAll.fanSTATICs;

import io.codeForAll.fanSTATICs.Heros.Mage;
import io.codeForAll.fanSTATICs.Heros.Warrior;

public class Main {
    public static void main(String[] args) {
        System.out.println("start the game");

        Mage magin = new Mage("magin", 100, 10, 10, 20);
        Warrior warrior = new Warrior("guerreiro", 100, 40, 40, 10);
        magin.action(warrior);
        magin.action(warrior);
        warrior.action(warrior);


    }
}
