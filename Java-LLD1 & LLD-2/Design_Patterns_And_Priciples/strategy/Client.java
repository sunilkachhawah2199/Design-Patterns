package Design_Patterns_And_Priciples.strategy;

public class Client {
    public static void main(String[] args) {
        Navigator navigator=new Navigator(new AirNavigation());
        navigator.navigate(new Point(1, 2), new Point(3, 4));
    }
}
