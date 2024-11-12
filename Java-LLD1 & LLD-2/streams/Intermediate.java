package streams;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* intermediate operation are that operations which transform 1 stream into another stream
intermediate operations are lazy, any intermediate operation will not execute until terminal operation
Ex. filter, map, sorted, distinct, limit, skip

filter: filter is used to filter input from stream according to logic
map: map method is intermediate operation, and it is used to transform element in stream, it takes function as argument
function is a functional interface and take type
 */
public class Intermediate {
    public static void main(String[] args) {
        //-------------------------- filtering and mapping --------------------------------
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");
        // Arrays.stream(arrayname) --> if arrays was present instead of list
        List<String> filtered1= fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .map(String:: toUpperCase)
                .collect(Collectors.toList()); //terminal operation

        // taking square of even number
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        List<Integer> squre= nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .collect(Collectors.toList());

        System.out.println(squre);

        // sorting in stream
        // comparator using stream
        Comparator<Integer> sortAscending= (a, b)->a-b;
        Comparator<Integer> sortDescending= (a, b)-> b-a;
        Stream<Integer> my= nums.stream()
                .filter(num -> (num&2)==0)
                .sorted(sortAscending);
    }
}
