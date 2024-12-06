package Design_Patterns_And_Priciples.flyweight;

// Intricic or repeating object attributes
public class TreeType {
    private static TreeType INSTANCE;

    private String color;
    private String name;
    private boolean giveFruit;

    private TreeType(){};

    public TreeType(String color, String name, boolean giveFruit) {
        this.color = color;
        this.name = name;
        this.giveFruit = giveFruit;
    }

    public String getColor() {
        return color;
    }

    public boolean isGiveFruit() {
        return giveFruit;
    }

    public String getName() {
        return name;
    }

    public void plant(){

    }
}
