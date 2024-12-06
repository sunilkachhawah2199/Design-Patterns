package Design_Patterns_And_Priciples.decorator;

public class ChocoCone implements Ingredient {

    public int getCost() {
        return 20;
    }

    public String getDescription() {
        return "choco cone added";
    }
}
