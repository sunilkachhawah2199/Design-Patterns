package Design_Patterns_And_Priciples.builder.developer_ready.v1;

public class Client {
    public static void main(String[] args) throws Exception {
        Student.Helper h=new Student.Helper("Sunil", 18, "Male");
        Student s=new Student(h);
        System.out.println(s.toString());
    }
}

/*
we have not get rid of helper class entirly
we will solve this in v2
 */