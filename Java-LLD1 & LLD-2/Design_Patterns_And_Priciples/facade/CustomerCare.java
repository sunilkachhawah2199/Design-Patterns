package Design_Patterns_And_Priciples.facade;

public class CustomerCare {
    public void placeOrder(String address, String product){
        Seller seller=new Seller();
        seller.getOrder(product, address);
    }
}
