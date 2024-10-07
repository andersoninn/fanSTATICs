package io.codeforall.bootcamp.cars;


public class Peugeot extends Car{

    public String brand;

    public Peugeot(){
        this.brand = "Peugeot";
    }
    @Override
    public String toString(){
        if(super.isCrashed()){
            return brand = "C";
        }
        return this.brand = "P";
}
}
