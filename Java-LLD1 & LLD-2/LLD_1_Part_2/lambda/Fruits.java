package LLD_1_Part_2.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Fruits {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple", "Banana", "Orange", "Mango");

        List<Integer> ls=new ArrayList<>();
        // ------- add fruit name length , which start from B Or O

        // tradition way -->
        for(String fruit: fruits){
            if(fruit.startsWith("B") || fruit.startsWith("O")){
                ls.add(fruit.length());
            }
        }

        // Arrays.stream(arrayname) --> if arrays was present instead of list
        // now using stream
        List<Integer> ls2=fruits.stream()
                        .filter(fruit -> fruit.startsWith("B") || fruit.startsWith("O"))
                .map(String::length)
                .collect(Collectors.toList());

        // sorting using functional interface
        Collections.sort(fruits, new SortingFunctional() {
            @Override
            public int compare(String a1, String a2) {
                return a1.compareTo(a2);
            }
        });

        System.out.println(fruits);
    }
}
