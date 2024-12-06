package LLD_1_Part_2.atomic_data_structures;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Prmitive {
    public static void main(String[] args) {
        // get(0, set(), incrementAndGet(), decrrementAndGet(), compareAndSet()
        // ----------------- int ---------------------
        AtomicInteger integer=new AtomicInteger(0);
        // increment:
        int newVal= integer.incrementAndGet();
        System.out.println(newVal);

        newVal=integer.decrementAndGet();
        System.out.println(newVal);

        // -----------------long ----------------------
        AtomicLong longVari=new AtomicLong(0);

    }
}
