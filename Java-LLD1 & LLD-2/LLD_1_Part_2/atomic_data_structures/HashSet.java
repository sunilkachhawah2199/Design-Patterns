package LLD_1_Part_2.atomic_data_structures;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// direct ConcurrentHashSet not exist in java.

public class HashSet {
    public static void main(String[] args) {
        Set<String> set= ConcurrentHashMap.newKeySet();
        set.add("Sunil");
        set.add("Anil");
        System.out.println(set);
    }
}
