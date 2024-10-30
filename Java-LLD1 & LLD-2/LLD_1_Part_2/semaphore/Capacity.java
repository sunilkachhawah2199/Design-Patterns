package LLD_1_Part_2.semaphore;

import java.util.concurrent.Callable;

public class Capacity {
    int num; // Current count of items
    final int maxCapacity; // Maximum allowed items

    public Capacity(int maxCapacity) {
        this.num = 4; // Start with an empty buffer
        this.maxCapacity = maxCapacity;
    }
}
