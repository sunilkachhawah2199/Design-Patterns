package Design_Patterns_And_Priciples.factory.products;

public class IosMenu implements Menu {
    @Override
    public void render() {
        System.out.println("rendering ios menu");
    }
}
