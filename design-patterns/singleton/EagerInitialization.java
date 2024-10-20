package singleton;

public class EagerInitialization {
    // static variable are initialized when the class is loaded into memory by JVM
    private static EagerInitialization obj = new EagerInitialization();
    private EagerInitialization() {
        // private constructor to avoid client applications to use constructor
    }
    public static EagerInitialization getInstance() {
        return obj;
    }
}


// pros
// 1. Simple to implement
// 2. No need to worry about the multi-threading issue
// 3. Eager initialization is the best approach if the cost of object creation is not too high

// cons
// 1. The object is created even if it is not being used
// 2. It may lead to resource wastage
// 3. If the object is not used at all, then it is a memory wastage
