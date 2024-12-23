package Design_Patterns_And_Priciples.adapter.payment.api;

public class Paypal {
    public void makePayment(){
        System.out.println("Payment made using Paypal");
    }
    public boolean verifyPayment(){
        System.out.println("Payment verified using Paypal");
        return true;
    }
}
