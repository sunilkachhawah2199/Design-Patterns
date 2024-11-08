package Design_Patterns_And_Priciples.factory.products;

public class AndroidMenu implements Menu {
    @Override
    public void render() {
        System.out.println("Drawing Android Menu");
    }
}
