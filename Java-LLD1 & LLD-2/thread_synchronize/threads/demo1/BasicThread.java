package thread_synchronize.threads.demo1;

public class BasicThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I am a basic thread "+ Thread.currentThread().getName());
    }
}
