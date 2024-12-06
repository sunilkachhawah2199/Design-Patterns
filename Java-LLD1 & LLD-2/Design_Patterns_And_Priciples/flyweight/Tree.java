package Design_Patterns_And_Priciples.flyweight;

// unique for each object
public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public Tree(int x, int y, TreeType treeType){
        this.x=x;
        this.y=y;
        this.treeType=treeType;
    }

    public void plant(){
        System.out.println("tree is planted at "+x+" ,"+y+" position and tree's name is "+this.treeType.getName());
    }
}
