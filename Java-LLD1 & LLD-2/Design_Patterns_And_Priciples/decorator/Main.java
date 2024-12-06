package Design_Patterns_And_Priciples.decorator;

public class Main {
    public static void main(String[] args) {
        Ingredient iceCream=new Cheery(
                new Syrum(
                        new MangoCone()
                )
        );
        System.out.println(iceCream.getDescription());

    }
}
