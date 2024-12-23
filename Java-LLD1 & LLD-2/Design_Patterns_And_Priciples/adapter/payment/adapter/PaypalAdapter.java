package Design_Patterns_And_Priciples.adapter.payment.adapter;

import Design_Patterns_And_Priciples.adapter.payment.api.Paypal;

public class PaypalAdapter implements PaymentService{
    Paypal paypal=new Paypal();
    @Override
    public void pay() {
        paypal.makePayment();
    }

    @Override
    public boolean verify() {
        return paypal.verifyPayment();
    }
}
