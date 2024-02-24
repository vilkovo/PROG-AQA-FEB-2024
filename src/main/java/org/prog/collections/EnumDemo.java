package org.prog.collections;

import java.util.HashMap;

public class EnumDemo {
    public static void main(String[] args) {

//        HashMap<Car, CarBrand> cars = new HashMap<>();
//        HashMap<Car, String> cars2 = new HashMap<>();
//        cars2.put(new Car(), "fake_brand");
//        cars.put(new Car(), CarBrand.MAZDA);
//        cars.put(new Car(), CarBrand.FORD);
//        cars.put(new Car(), CarBrand.FIAT);
//        cars.put(new Car(), CarBrand.TOYOTA);
//
        smth(CarBrand.FORD);
    }

    public static void smth(CarBrand carBrand) {
        switch (carBrand) {
            case FIAT:
                System.out.println("This is FIAT");
                break;
            case FORD:
                System.out.println("This is FORD");
                break;
            case MAZDA:
                System.out.println("This is MAZDA");
                break;
            case TOYOTA:
                System.out.println("This is TOYOTA");
                break;
        }
    }
}
