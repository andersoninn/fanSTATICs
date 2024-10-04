package io.codeforall.bootcamp.cars;

public class CarFactory {

    public static Car getNewCar() {
        int typeCar = (int) (Math.random() * 2);
        if (typeCar == 1){
            return new Peugeot();
        }
        return new Opel();

    }
}
