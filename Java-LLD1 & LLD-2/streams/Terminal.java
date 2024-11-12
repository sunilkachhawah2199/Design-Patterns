package streams;


/* -------------advantage of stream-----------------
stream was introduced to perform operation on sequent of element like array and collections in more concise, readable, compact from and in expressive way
streams can be converted in parallel stream and multi core can do fast process for data processing

----------------terminal operation ------------------

terminal operation start the process of intermediate operation and produce a final result
eager in nature, executed immediately
Ex: forEach, count, collect, reduce, min, max, anyMatch, allMatch, noneMatch
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Terminal {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,8,9);

        // direct stream
        Stream< Integer> stream=Stream.of(1,2,3,4,5);
        // Iterating: forEach is used for iterating

        ls.stream()
                .forEach((num) ->{
                    System.out.print(num+" ");
                });
        System.out.println();

        /* Reducing: the reduce method is used to reduce the element in a stream to single value
        argument: identity, binary operator

         */
        int num=ls.stream()
                .reduce(0, (a,b)-> a+b);
        System.out.println(num);

        // collect: method is used to collect stream element into collections
        List<Integer> col=ls.stream()
                .filter(n -> (n%2)==0)
                .toList(); // or we can use --> .collect(Collectors.toList())
        System.out.println(col);

        // count --> is used to count element in stream
        long num2=ls.stream()
                .count();

        // joining is used to concat stream elements, return type will be long
        Stream<String> fruit=Stream.of("Apple","Banana", "Mango", "Orange");
        String concat=fruit.collect(Collectors.joining()); // op: AppleBananaMangoOrange

    }
}
