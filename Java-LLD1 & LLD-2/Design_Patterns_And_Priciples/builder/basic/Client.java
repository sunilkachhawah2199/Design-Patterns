package Design_Patterns_And_Priciples.builder.basic;

public class Client {
    public static void main(String[] args) throws Exception {
        Helper help=new Helper("Sunil", 18, "Male");
        Student s=new Student(help);
        System.out.println("object created");
    }
}
/*
this approach is not developer friendly
because client has to know about both class --> helper class and target class
 */