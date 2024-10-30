package LLD_1_Part_2.threads.demo1;

public class Example {
    public static void main(String[] args) throws Exception{
        BasicThread bt=new BasicThread();
        int i=1;
        while(i<100){
            Thread t=new Thread(bt);
            t.start();
            try{
                t.join();
            }
            catch (InterruptedException e){
                System.out.println("interupted");
            }
            i++;
        }
        System.out.println(" I am main thread");
    }
}

// .join() --> force main to wait until all thread executed.
//.join() --> can throw exception so we have to handle this,
