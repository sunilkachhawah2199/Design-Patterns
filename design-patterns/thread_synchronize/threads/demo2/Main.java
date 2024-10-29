package thread_synchronize.threads.demo2;

public class Main {
    public static void main(String[] args) throws Exception{
        EvenPrinter ev=new EvenPrinter();
        OddPrinter od= new OddPrinter();
        Thread t1=new Thread(ev);
        Thread t2=new Thread(od);
        t1.join();
        t2.join();
        t1.start();
        t2.start();
        System.out.println("completed");
    }
}
