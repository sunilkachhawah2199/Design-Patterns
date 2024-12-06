package Design_Patterns_And_Priciples.facade;

// user is not aware about how order was placed he just called to customer care and told them address and product name
public class User {
    public static void main(String[] args) {
        CustomerCare customerCare=new CustomerCare();
        customerCare.placeOrder("Jodhpur", "Gun");
    }
}
