package LLD_1_Part_2.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple", "Banana", "Orange", "Mango");

        List<Integer> ls=new ArrayList<>();
        // create stream from collections
        // output will be Stream type
        Stream<String> fruit= fruits.stream();

        // creating stream from array
        String [] fruitArray={"Apple", "Banana", "Orange", "Mango"};
        Stream<String> fruitArr= Arrays.stream(fruitArray);


        // creating stream of integer
        IntStream intStream= IntStream.rangeClosed(0,5);

    }
}
