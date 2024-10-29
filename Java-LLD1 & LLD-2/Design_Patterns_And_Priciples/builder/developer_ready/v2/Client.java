package Design_Patterns_And_Priciples.builder.developer_ready.v2;

public class Client {
    public static void main(String[] args) throws Exception {
        // we are still using Student.helper --> we have to get rid of this | we will use constructor chaining

        /*
        Student.Helper helper = Student.getHelper()
                .setName("John Doe")
                .setAge(18)
                .setGender("Male");

         return type of this will be Helper if we can return Student object directly then we will get rid of Helper class completely

         */

        Student s = Student.getHelper()
                .setName("John Doe")
                .setAge(18)
                .setGender("Male")
                // above all 3 will return helper object
                // below 1 will return student type object
                .build();
    }
}


/*
        1. Get rid of 2 classes and have a single class.
        2. Make Builder as static inner class
        3. Create a static method in Student (getBuilder), which return obj of Design_Patterns_And_Priciples.builder
        4. We changed the return type of setters to Builder. // Method Chaining
        5. We will create build method inside Builder --> which will return Student
 */
