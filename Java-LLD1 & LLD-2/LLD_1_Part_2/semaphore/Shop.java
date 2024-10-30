package LLD_1_Part_2.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class Shop{
    Capacity cap;
    // we have to first initialize cap object then take value from them
    Semaphore consumers; // 0 consumer allowed
    Semaphore producers;

    public Shop(Capacity c){
        this.cap=c;
        producers=new Semaphore(cap.maxCapacity); // max product which is == max capacity
        consumers=new Semaphore(cap.num); // consumer allowed to buy available product only
    }



    //
    public void consume() throws InterruptedException{
        consumers.acquire();
        // keep cap operation synchronized other vise final value will not be equal to initial capacity
        synchronized (cap) {
            cap.num--;
        }


        producers.release();
    }

    public void produce() throws InterruptedException{
        producers.acquire();
        synchronized (cap){
            cap.num++;
        }


        consumers.release();
    }

}
