package org.prog.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsCollection {

    /**
     * Array List:
     * [0] - string
     * [1] - string
     * [2] - string
     * [3] - string
     * [4] - string
     * [...] - strings
     * [100000] - existing string <- [100000] new string
     * [...] - strings
     * [9999999999] - string
     *
     * LinkedList
     *                                         !!
     * [start-od-list] - [string1] - [string2] - [string3] - ... - [string99999999999] - [end-of-list]
     * [start-od-list] - [string1] - [string2] - [newStringElement]- [string3] - ... - [string99999999999] - [end-of-list]
     * @param args
     */
    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        List<String> list = new LinkedList<>();

        stringList1.add("a");
        stringList1.add("b");
        stringList1.add("c");

        stringList2.add("d");
        stringList2.add("e");
        stringList2.add("f");

        stringList1.addAll(stringList2);
//        stringList1.remove("a");
//        stringList1.remove(2);

        for (String s : stringList1) {
            System.out.println(s);
        }

//        List<Car> cars = new ArrayList<>();
//        Car myCar = new Car();
//        for (int i = 0; i < 40; i++) {
//            cars.add(new Car());
//            if (i == 15) {
//                cars.add(myCar);
//            }
//        }


//        System.out.println("My car index: " + cars.indexOf(myCar));
//
//        System.out.println(cars.size());
    }
}