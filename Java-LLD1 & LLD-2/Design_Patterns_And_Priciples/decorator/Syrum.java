package Design_Patterns_And_Priciples.decorator;


// it is a add on
public class Syrum extends IngredientDecorator{
    public Syrum(Ingredient baseIngredient){
        super(baseIngredient);
    }

    @Override
    public int getCost() {
        return baseIngredient.getCost()+10;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+", choco syrum added";
    }
}
