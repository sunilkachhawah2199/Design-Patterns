package LLD_1_Part_2.atomic_data_structures;

import java.util.concurrent.ConcurrentHashMap;

public class HashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> hm=new ConcurrentHashMap<>();
        hm.put(1,"Sunil");
        hm.put(2,"Anil");
        System.out.println(hm);
    }
}
