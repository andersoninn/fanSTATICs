package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public class Opel extends Car{
    public String brand;

    public Opel(){
        this.brand = "Opel";
    }
    @Override
    public String toString(){
        if(super.isCrashed()){
        return brand = "C";
        }
        return this.brand = "O";
    }
}
