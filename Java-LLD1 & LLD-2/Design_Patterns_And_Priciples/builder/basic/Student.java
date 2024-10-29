package Design_Patterns_And_Priciples.builder.basic;

public class Student {
    private String name;
    private int age;
    private String gender;
    private Student(){}
    public Student(Helper helper) throws Exception{
        if(helper.age<18){
            throw new Exception("you are child to join us");
        }
        this.name = helper.name;
        this.age = helper.age;
        this.gender = helper.gender;
    }
}
