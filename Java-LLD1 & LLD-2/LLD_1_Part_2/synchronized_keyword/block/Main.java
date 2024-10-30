package LLD_1_Part_2.synchronized_keyword.block;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws Exception{
        Lock lock=new ReentrantLock();
        Count c=new Count(0,lock);

        Adder adder=new Adder(c);
        Subtractor sub=new Subtractor(c);



            Thread add=new Thread(adder);
            Thread su=new Thread(sub);
            add.start();
            su.start();
            add.join();
            su.join();


        System.out.println("final " +c.num);
    }
}
