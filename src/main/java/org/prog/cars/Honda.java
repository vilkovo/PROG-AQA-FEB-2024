package org.prog.cars;

public class Honda implements ICar {
    @Override
    public void goTo() {
        System.out.println("Honda uses gas");
    }

    @Override
    public void fillCar() {
        System.out.println("Honda is using gas");
    }

    @Override
    public void interiorCar() {
        System.out.println("Honda has a white interior");
    }
}
