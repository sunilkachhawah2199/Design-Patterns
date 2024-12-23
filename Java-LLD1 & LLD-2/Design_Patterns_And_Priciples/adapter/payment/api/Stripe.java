package Design_Patterns_And_Priciples.adapter.payment.api;

public class Stripe {
    public void createPayment(){
        System.out.println("Payment made using Stripe");
    }
    public boolean checkPayment(){
        System.out.println("Payment verified using Stripe");
        return true;
    }
}
