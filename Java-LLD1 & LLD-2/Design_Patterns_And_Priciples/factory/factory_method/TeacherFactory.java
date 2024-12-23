package Design_Patterns_And_Priciples.factory.factory_method;


import Design_Patterns_And_Priciples.factory.factory_method.models.Teacher;
import Design_Patterns_And_Priciples.factory.factory_method.models.User;

// Concrete Factory class for creating Teacher object
public class TeacherFactory implements UserFactory{
    @Override
    public User createUser(String name, String age) {
        return new Teacher(name, age);
    }
}
