package singleton;

public class Basic {
    private static Basic obj=null;

    // constructor is private so no one can create object
    private Basic(){

    }

    public static Basic getInstance(){
        if(obj==null){
            obj=new Basic();
        }
        return obj;
    }
}

/*
this is very basic approach
we can get object of singleton class using only getInstance method only
this will work very well in Single thread application only but this code will get fail in MT application.
 */
