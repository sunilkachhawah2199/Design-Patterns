package Design_Patterns_And_Priciples.flyweight;

public class Forest {
    public static void main(String[] args) {
        TreeType treeType=TreeFactory.getTreeType("Fool", "Pink", false);
        Tree tree=new Tree(5,4, treeType);
        System.out.println(tree.getTreeType());
        tree.plant();

        Tree tree2=new Tree(4,5, treeType);
        System.out.println(tree2.getTreeType());
        tree2.plant();

    }
}
