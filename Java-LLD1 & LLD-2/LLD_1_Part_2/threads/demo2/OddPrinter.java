package LLD_1_Part_2.threads.demo2;

public class OddPrinter implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2!=0) System.out.println("I am odd number "+i+" "+Thread.currentThread().getName());
        }
    }
}
