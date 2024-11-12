package LLD_1_Part_2.mutex;


import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count cnt;
    Lock lock;
    public Adder(Count cnt, Lock lock){
        this.cnt=cnt;
        this.lock=lock;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            lock.lock();
            cnt.num++;
            lock.unlock();
        }
    }
}
