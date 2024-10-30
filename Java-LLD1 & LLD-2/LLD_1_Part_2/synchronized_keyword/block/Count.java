package LLD_1_Part_2.synchronized_keyword.block;

import java.util.concurrent.locks.Lock;

public class Count {
    int num;
    Lock lock;
    public Count(int x, Lock lock){
        this.num=x;
        this.lock=lock;
    }

    public void increment(){
        synchronized (lock){
            this.num++;
        }

    }

    public void decrement(){
        synchronized (lock){
            this.num--;
        }
    }
}


// without synchronized block final value of num will not be same as a initial.