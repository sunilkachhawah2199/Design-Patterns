package Design_Patterns_And_Priciples.decorator;

public class Cheery extends IngredientDecorator {
    // it is a add on it can't exist wihtout cone/ base ingredients
    // add ons are added as a decorator it will inherit decorator
    public Cheery(Ingredient baseIngredient){
        super(baseIngredient);
    }
    @Override
    public int getCost() {
        return baseIngredient.getCost()+15;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+" cherry added";
    }
}
