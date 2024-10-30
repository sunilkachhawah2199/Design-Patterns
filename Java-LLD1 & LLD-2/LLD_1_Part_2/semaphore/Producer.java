package LLD_1_Part_2.semaphore;


// will add new product in shop but max product can be added== max capacity
public class Producer implements Runnable{
    Shop shop;
    public Producer(Shop s){
        this.shop=s;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            try{
                shop.produce();
                System.out.println("product purchased "+i);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
