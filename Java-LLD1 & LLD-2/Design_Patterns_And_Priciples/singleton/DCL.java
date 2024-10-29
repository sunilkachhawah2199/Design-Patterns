package Design_Patterns_And_Priciples.singleton;
// double checked locking approach
public class DCL {
    private static DCL instance=null;
    private DCL(){
        // private constructor --> object creation is not possible from outside the class
    }

    public static DCL getInstance(){
        if(instance==null){
            synchronized(DCL.class){
                if(instance==null){
                    instance=new DCL();
                }
            }
        }
        return instance;
    }
}

/*
this is a most recommended approach to create a Design_Patterns_And_Priciples.singleton class.
In this approach, we have used double-checked locking to solve the problem of multiple threads accessing the
getInstance() method at the same time.
 */