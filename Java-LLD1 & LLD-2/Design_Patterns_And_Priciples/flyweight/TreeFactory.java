package Design_Patterns_And_Priciples.flyweight;
import java.util.HashMap;
import java.util.Map;



// or we can make Intrinsic class Singleton then we have no need to use this Factory --> will be wrong approach because in that scenario we can't create another tree with different name , and that tree is different tree so we should be able to create new TreeType

public class TreeFactory {
    static Map<String, TreeType> treeTypeMap=new HashMap<>();

    public static TreeType getTreeType(String name, String color, boolean giveFruit){
        TreeType result=treeTypeMap.get(name);
        if(result==null){
            treeTypeMap.put(name, new TreeType(color, name, giveFruit));
        }
        return treeTypeMap.get(name);
    }
}
