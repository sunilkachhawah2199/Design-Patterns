package Design_Patterns_And_Priciples.decorator;

// it is for adding base to our icecream like icecream can't exist without cone or base
public abstract class IngredientDecorator implements Ingredient {
    Ingredient baseIngredient;
    public IngredientDecorator(Ingredient baseIngredient){
        this.baseIngredient =baseIngredient;
    }
}
