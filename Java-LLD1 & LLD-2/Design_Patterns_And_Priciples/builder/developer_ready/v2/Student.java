package Design_Patterns_And_Priciples.builder.developer_ready.v2;

public class Student {
    String name;
    int age;
    String gender;


    // constructor which takes Helper object
    // we will call this constructor from Builder class
    private Student(Helper helper) throws Exception{
        if (age<18) throw new Exception("this age is not allowed");
        this.name = helper.name;
        this.age = helper.age;
        this.gender = helper.gender;
    };

    // method to return Builder object without using Builder/ Helper class in Client side
    // this method return Helper object
    public static Helper getHelper(){
        return new Helper();
    }


    // we need static inner class we can create object of this without outer class
    // this is a builder class
    // generally this class contains all the fields of outer class and setter methods
    public static class Helper{
        private String name;
        private int age;
        private String gender;

        // we did change the return type of setter  so we can do chaining
        public Helper setName(String name) {
            this.name = name;
            return this;
        }

        public Helper setAge(int age) {
            this.age = age;
            return this;
        }

        public Helper setGender(String gender) {
            this.gender = gender;
            return this;
        }

        // this method will return Student object using Outer class constructor which take Helper object
        public Student build() throws Exception{
            return new Student(this);
        }
    }
}
