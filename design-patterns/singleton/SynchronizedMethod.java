package singleton;
// in this approach we will try to solve the problem of multiple threads accessing the getInstance() method at the same time
public class SynchronizedMethod {
    private static SynchronizedMethod instance=null;
    private SynchronizedMethod(){
        // private constructor --> object creation is not possible from outside the class
    }

    public static synchronized SynchronizedMethod getInstance(){
        if(instance==null){
            instance=new SynchronizedMethod();
        }
        return instance;
    }
}


/*
this is a worst approach to create a singleton class.
    In this approach, we have made the getInstance() method synchronized.
    This means that only one thread can access this method at a time.
    This approach solves the problem of multiple threads accessing the getInstance() method at the same time.
    But it has a performance issue.
    If one thread is accessing the getInstance() method, then other threads have to wait until the first thread completes its execution.
    This approach is not recommended for multi-threaded applications.
 */