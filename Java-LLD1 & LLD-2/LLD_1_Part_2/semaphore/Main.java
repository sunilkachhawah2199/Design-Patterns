package LLD_1_Part_2.semaphore;

public class Main {
    public static void main(String[] args) throws Exception{
        Capacity c=new Capacity(4);
        Shop s=new Shop(c);
        Thread produce=new Thread(new Producer(s));
        Thread consume=new Thread(new Consumer(s));
        produce.start();
        consume.start();
        produce.join();
        consume.join();
        System.out.println("final capacity "+c.num);
    }
}
/*
assumption:
consumer== product added
 */
