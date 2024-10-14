package io.codeForAll.fanSTATICs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();
        toDoList.add(Importance.LOW, 2, "teste");
        toDoList.add(Importance.LOW, 1, "teste");


        while (!toDoList.isEmpty()){
            System.out.println(toDoList.remove());
        }
    }
}
