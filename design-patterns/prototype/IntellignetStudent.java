package prototype;

public class IntellignetStudent extends Student {
    private int iq;

    public IntellignetStudent(String name, int age, int iq) {
        super(name, age);
        this.iq = iq;
    }
    public IntellignetStudent(IntellignetStudent is){
        super(is);
        this.iq = is.iq;
    }

    public IntellignetStudent clone(){
        return new IntellignetStudent(this);
    }
}
