package Design_Patterns_And_Priciples.factory.products;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android Button clicked");
    }
}
