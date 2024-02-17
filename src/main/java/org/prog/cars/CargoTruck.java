package org.prog.cars;

public class CargoTruck extends Truck{

    @Override
    public void turnLeft (){
        System.out.println("Cargo truck turn left");
    }
    @Override
    public void turnRight (){
        System.out.println("Cargo truck turn right");
    }
}
