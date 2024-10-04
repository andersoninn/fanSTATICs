package io.codeforall.bootcamp.cars;

public class Opel extends Car{
    public String name;

    public Opel(){
        this.name = "O";
    }
    @Override
    public String toString(){
        if(super.isCrashed()){
        return"C";
        }
        return "O";
    }
}
