package Design_Patterns_And_Priciples.factory.native_app.products;

public class IosButton implements Button {
    @Override
    public void click() {
        System.out.println("Ios Button clicked");
    }
}
