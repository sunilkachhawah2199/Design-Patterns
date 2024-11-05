package collections_exceptions.object;

import java.security.PublicKey;

public class ObjectPrinter {
    private Object ob;

    public Object getOb() {
        return ob;
    }

    // constructor
    public ObjectPrinter(Object ob){
        this.ob=ob;
    }

    //printer class
    // it will print object class's object we will typecast in client
    public void print(){
        System.out.println(this.ob);
    }
}
