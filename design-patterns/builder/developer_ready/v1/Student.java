package builder.developer_ready.v1;



public class Student {
    String name;
    int age;
    String gender;

    // private constructor --> direct object creation is not allowed here
    public Student(Helper helper) throws Exception{
        if(helper.age<18) throw new Exception("this age is not allowed");
        this.name = helper.name;
        this.age = helper.age;
        this.gender = helper.gender;
    };



    // we need static inner class we can create object of this without outer class
    public static class Helper{
        private String name;
        private int age;
        private String gender;

        public Helper(String name, int age, String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    }
}
