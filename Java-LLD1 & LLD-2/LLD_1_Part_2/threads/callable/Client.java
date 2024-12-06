package LLD_1_Part_2.threads.callable;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        ExecutorService e= Executors.newFixedThreadPool(5);
        Task<Integer> t=new Task<>(); // need to declare generic type
        Future<Integer> future= e.submit(t);
        future.get();
        e.shutdown();
    }
}
