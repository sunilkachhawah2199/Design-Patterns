package Design_Patterns_And_Priciples.prototype;

public class IntellignetStudent extends Student {
    private int iq;

    public IntellignetStudent(String name, int age, int iq) {
        // we have to call parent class constructor for constructor chaining because of default constructor not exist
        super(name, age);
        this.iq = iq;
    }

    // copy constructor
    public IntellignetStudent(IntellignetStudent is){
        super(is);
        this.iq = is.iq;
    }

    public IntellignetStudent clone(){
        return new IntellignetStudent(this);
    }
}
