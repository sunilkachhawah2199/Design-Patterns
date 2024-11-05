package collections_exceptions.object;

import org.w3c.dom.ls.LSOutput;

public class Cleint {
    public static void main(String[] args) {
        // Object ob=new Object() --> is not allowed
        Object ob="Sunil";
        ObjectPrinter name=new ObjectPrinter(ob);
        name.print();
        // int num =name.getOb(); // will give error because it is object type
        int num=(int) name.getOb(); // but this type cast is wrong because object is String type | it will give runtime error
    }
// we can get validation error

}
