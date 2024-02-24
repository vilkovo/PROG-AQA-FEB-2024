package org.prog.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        String fireFox = "ff";

        Set<String> stringSet1 = new HashSet<>();
        Set<String> stringSet2 = new HashSet<>();
        stringSet1.add("a");
        stringSet1.add("b");

        stringSet2.add("b");
        stringSet2.add("c");

        stringSet1.addAll(stringSet2);
        System.out.println(stringSet1.size());
        Iterator<String> stringIterator = stringSet1.iterator();
        while (stringIterator.hasNext()) {
            String s = stringIterator.next();
            System.out.println(s);
        }
    }
}
