package Design_Patterns_And_Priciples.strategy;

// it is a air navigation strategy
public class AirNavigation implements NavigationStrategy {
    @Override
    public void navigate(Point from, Point to) {
        System.out.println("Navigating by air from " + from.x + ", " + from.y + " to " + to.x + ", " + to.y);
    }
}
