package thread_synchronize.executors.runable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
1. create task --> create object of class
2. create thread pool ExecutorsService
3. add all in thread pool --> .execute() || when using Runnable
4. .submit --> when using callable

 */
public class Client {
    public static void main(String[] args) {
        NumberPrinter np;
        ExecutorService es= Executors.newFixedThreadPool(2);
        for(int i=1;i<=1000; i++){
            np=new NumberPrinter();
            es.execute(np);
        }

        es.shutdown();
        System.out.println("main");
    }
}
