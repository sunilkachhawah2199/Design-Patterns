package Design_Patterns_And_Priciples.factory.products;

public class IosButton implements Button {
    @Override
    public void click() {
        System.out.println("Ios Button clicked");
    }
}
