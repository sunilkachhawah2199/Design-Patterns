package LLD_1_Part_2.synchronized_keyword.block;

public class Adder implements Runnable{
    Count c;
    public Adder(Count c){
        this.c=c;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            c.increment();
        }
    }
}