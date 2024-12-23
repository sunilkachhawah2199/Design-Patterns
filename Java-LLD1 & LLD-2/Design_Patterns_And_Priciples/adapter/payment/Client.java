package Design_Patterns_And_Priciples.adapter.payment;

import Design_Patterns_And_Priciples.adapter.payment.adapter.PaymentService;
import Design_Patterns_And_Priciples.adapter.payment.adapter.PaypalAdapter;
import Design_Patterns_And_Priciples.adapter.payment.adapter.StripeAdapter;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new StripeAdapter();
        paymentService.pay();
        paymentService.verify();

    }
}
