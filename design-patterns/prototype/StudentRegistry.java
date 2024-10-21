package prototype;

import java.util.HashMap;
import java.util.concurrent.Callable;

// this should be singleton class
public class StudentRegistry  {
    private HashMap<String, Student> registry;
    private StudentRegistry(){
        // when new object created then new registry will be created
        registry=new HashMap<>();
    }; // private constructor

    private static StudentRegistry INSTANCE=null;

    public static StudentRegistry getInstance() {
        if (INSTANCE == null) {
            synchronized (StudentRegistry.class) {
                if (INSTANCE == null) {
                    System.out.println("new registry object created");
                    INSTANCE = new StudentRegistry();
                }
            }
        }
        return INSTANCE;
    }

    // add in registry
    public void add(String key, Student s){
        registry.put(key, s);
        System.out.println("added to registry");
    }

    // get from registry
    public Student get(String key) throws Exception{
        Student s=registry.get(key);
        if(s==null) throw new Exception("no registry exist with this key");
        else return s;
    }
}
