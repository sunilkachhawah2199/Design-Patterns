package Design_Patterns_And_Priciples.adapter.payment.adapter;

import Design_Patterns_And_Priciples.adapter.payment.api.Stripe;

public class StripeAdapter implements PaymentService{
    Stripe stripe=new Stripe();
    @Override
    public void pay() {
        stripe.createPayment();
    }

    @Override
    public boolean verify() {
        return stripe.checkPayment();
    }
}
