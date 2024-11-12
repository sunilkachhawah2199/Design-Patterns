package LLD_1_Part_2.mutex;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//we share same lock object with both lock instance
public class Main {
    public static void main(String[] args) throws Exception{
        Count cnt=new Count(0);
        Lock lock=new ReentrantLock();
        Adder add=new Adder(cnt, lock);
        Substractor sub=new Substractor(cnt, lock);
        Thread t1=new Thread(add);
        Thread t2=new Thread(sub);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        System.out.println("cnt.num "+cnt.num);
    }
}