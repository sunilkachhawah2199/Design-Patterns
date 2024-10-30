package LLD_1_Part_2.semaphore;

// consumer will buy item from shop but they can but maximum== cap.num --> which is available stock
public class Consumer implements  Runnable{
    Shop shop;
    public Consumer(Shop s){
        this.shop=s;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            try{
                shop.consume();
                System.out.println("product added "+ i);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
    }
}
