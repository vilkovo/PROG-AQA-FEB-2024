package org.prog.collections;

import javax.naming.Name;
import java.util.*;

/**
 * Write HashMap of owned cars, set their colors using enum you create
 * print owners of cars of certain color
 */
public class HomeWork4 {
    public static void main(String[] args) {

        HashMap<Car, String> ownerCars1 = new HashMap<>();
        ownerCars1.put(new Car(CarColors.BLACK), "Rex");
        ownerCars1.put(new Car(CarColors.WHITE), "Rex");
        ownerCars1.put(new Car(CarColors.GREEN), "Olivia");
        ownerCars1.put(new Car(CarColors.BLACK), "Olivia");
        ownerCars1.put(new Car(CarColors.RED), "Freya");
        ownerCars1.put(new Car(CarColors.GREEN), "Freya");
        ownerCars1.put(new Car(CarColors.WHITE), "Mike");
        ownerCars1.put(new Car(CarColors.RED), "Mike");

        List<Car> listCars = new ArrayList<>();
        Set<Car> setSars = ownerCars1.keySet();
        for (Car c : setSars){
            if (c.carColor.equals(CarColors.BLACK)){
                listCars.add(c);
            }
        }
        for (Car c : listCars){
            System.out.println(ownerCars1.get(c));
        }

        //TODO HomeWork

        System.out.println("******** HomeWork ********");

        HashMap<Car, String> ownerCars2 = new HashMap<>();
        ownerCars2.put(new Car(CarColors.BLACK), "Rex");
        ownerCars2.put(new Car(CarColors.WHITE), "Rex");
        ownerCars2.put(new Car(CarColors.GREEN), "Olivia");
        ownerCars2.put(new Car(CarColors.BLACK), "Olivia");
        ownerCars2.put(new Car(CarColors.RED), "Freya");
        ownerCars2.put(new Car(CarColors.GREEN), "Freya");
        ownerCars2.put(new Car(CarColors.WHITE), "Mike");
        ownerCars2.put(new Car(CarColors.RED), "Mike");

        List<Car> carsFreya = new ArrayList<>();
        List<Car> carsRex = new ArrayList<>();

        System.out.print("FREYA's cars are this color: ");

        for (Map.Entry<Car, String> keys : ownerCars2.entrySet()) {
            if (keys.getValue().equals("Freya")) {
                carsFreya.add(keys.getKey());
            }
        }
        for (Car cars : carsFreya) {
            System.out.print(" * " + cars.carColor);
        }

        System.out.print("\nREX's cars are this color: ");

        for (Map.Entry<Car, String> keys : ownerCars2.entrySet()) {
            if (keys.getValue().equals("Rex")) {
                carsRex.add(keys.getKey());
            }
        }
        for (Car cars : carsRex) {
            System.out.print(" * " + cars.carColor);
        }
    }
}
