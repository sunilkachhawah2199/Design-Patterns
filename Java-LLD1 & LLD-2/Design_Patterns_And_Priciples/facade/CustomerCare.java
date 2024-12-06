package Design_Patterns_And_Priciples.facade;

import Design_Patterns_And_Priciples.adapter.Sendgrid;

public class CustomerCare {
    public void placeOrder(String address, String product){
        Seller seller=new Seller();
        seller.getOrder(product, address);
    }
}
