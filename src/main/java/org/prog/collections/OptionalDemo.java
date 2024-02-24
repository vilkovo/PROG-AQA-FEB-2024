package org.prog.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        List<Optional<String>> optStrings = new ArrayList<>();
        for (Optional<String> o : optStrings){
            o.ifPresent(s -> System.out.println(s));
        }

        Optional<String> optional1 = Optional.ofNullable("s");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

//        System.out.println(optional1);
//        System.out.println(optional1.get());
//        String defString = optional2.orElse("defaultValue");
//        System.out.println(defString);
        optional1.ifPresent(s -> System.out.println(s));
        optional2.ifPresent(s -> System.out.println(s));
        optional3.ifPresent(s -> System.out.println(s));

        if (optional1.isPresent()){
            System.out.println(optional1.get());
        }
    }
}
