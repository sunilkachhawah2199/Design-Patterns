package Design_Patterns_And_Priciples.strategy;

// it is a context class for switching between different strategies
public class Navigator {
    private NavigationStrategy navigationStrategy;
    public Navigator(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }
    public void navigate(Point from, Point to) {
        navigationStrategy.navigate(from, to);
    }
}
