package org.prog.cars;

public class Tesla implements ICar {
    @Override
    public void goTo() {
        System.out.println("Tesla uses electricity");
    }

    @Override
    public void fillCar() {
        System.out.println("Tesla is charging...");
    }

    @Override
    public void interiorCar() {
        System.out.println("Tesla has a black interior");

    }

    public void autoPilot() {
        System.out.println("Tesla is driving with autopilot");
    }
}
