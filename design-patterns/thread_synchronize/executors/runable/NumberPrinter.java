package thread_synchronize.executors.runable;

public class NumberPrinter implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++) System.out.println("num "+" "+i+" "+Thread.currentThread().getName());
    }
}