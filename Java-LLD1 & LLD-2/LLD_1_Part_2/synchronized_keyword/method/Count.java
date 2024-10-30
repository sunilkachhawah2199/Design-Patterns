package LLD_1_Part_2.synchronized_keyword.method;

public class Count {
    int num;
    public Count(int x){
        this.num=x;
    }

    public synchronized void increment(){
        this.num++;
    }

    public synchronized void decrement(){
        this.num--;
    }
}


// without synchronized block final value of num will not be same as a initial.