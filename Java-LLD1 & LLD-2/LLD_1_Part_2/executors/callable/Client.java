package LLD_1_Part_2.executors.callable;

import LLD_1_Part_2.executors.runable.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        NumberPrinter np;
        ExecutorService es= Executors.newFixedThreadPool(2);
        Future<Integer> fs;
        for(int i=1;i<=500;i++){
            np=new NumberPrinter();
            fs=(Future<Integer>) es.submit(np);
            try{
                int x=fs.get();
            }
            catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        }

        es.shutdown();
    }
}

// use .submit() --> when using callable.
// we use Future to hold a value which will wi returned by Callable
