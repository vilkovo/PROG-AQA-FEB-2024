package org.prog.cars;

public class Lorry extends CargoTruck{
    @Override
    public void turnLeft (){
        System.out.println("Lorry turn left");
    }
    @Override
    public void turnRight (){
        System.out.println("Lorry turn right");
    }
}
