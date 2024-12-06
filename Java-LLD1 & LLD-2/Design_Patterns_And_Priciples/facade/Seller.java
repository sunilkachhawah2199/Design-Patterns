package Design_Patterns_And_Priciples.facade;

import java.util.logging.SocketHandler;

public class Seller {
    public void getOrder(String productName, String address){
        System.out.println("order received for "+productName);
        Shipping shipping=new Shipping();
        shipping.schdulePick("15/5/24", address);
    }
}
