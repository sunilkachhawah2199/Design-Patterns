package Design_Patterns_And_Priciples.decorator;


// this is base ingredient
public class MangoCone implements Ingredient {

    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "mango cone added";
    }
}
