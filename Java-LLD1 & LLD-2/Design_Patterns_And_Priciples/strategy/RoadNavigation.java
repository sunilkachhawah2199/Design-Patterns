package Design_Patterns_And_Priciples.strategy;

// it is a road navigation strategy
public class RoadNavigation implements NavigationStrategy {
    @Override
    public void navigate(Point from, Point to) {
        System.out.println("Navigating by road from " + from.x + ", " + from.y + " to " + to.x + ", " + to.y);
    }
}
