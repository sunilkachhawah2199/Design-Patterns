package Design_Patterns_And_Priciples.factory.native_app.products;

public class IosMenu implements Menu {
    @Override
    public void render() {
        System.out.println("rendering ios menu");
    }
}
