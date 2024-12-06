package Design_Patterns_And_Priciples.prototype;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    // we have to keep this public so child can use this or we can make this protected
    protected Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    public Student clone(){
        // will call copy constructor on same object which called this method.
        return new Student(this);
    }

}
