package LLD_1_Part_2.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple", "Banana", "Orange", "Mango");
        Collections.sort(fruits, (a, b)-> a.compareTo(b));
        System.out.println(fruits);
    }
}

