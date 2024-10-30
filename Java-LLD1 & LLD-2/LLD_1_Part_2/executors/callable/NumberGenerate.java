package LLD_1_Part_2.executors.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberGenerate implements Callable<Integer> {
    Random r;
    @Override
    public Integer call(){
        r=new Random();
        System.out.println("I am new Number");
        return r.nextInt();
    }
}
