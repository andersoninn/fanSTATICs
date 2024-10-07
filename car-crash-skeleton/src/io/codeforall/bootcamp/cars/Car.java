package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private int velocity;
    private boolean crashed;

    public Car(){
        this.pos = new Position();
        this.velocity = velocity;
        this.crashed = true;
    }

    public Position getPos() {
        return pos;
    }


    public boolean isCrashed() {
        return !crashed;
    }

    /*
    public void move(){

        switch (){

        }
    }

*/
}
