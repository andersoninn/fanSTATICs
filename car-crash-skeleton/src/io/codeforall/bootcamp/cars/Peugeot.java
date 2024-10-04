package io.codeforall.bootcamp.cars;


public class Peugeot extends Car{

    public String name;

    public Peugeot(){
        this.name = "P";
    }
    @Override
    public String toString(){
        if(super.isCrashed()){
            return"C";
        }
        return "P";
}
}
