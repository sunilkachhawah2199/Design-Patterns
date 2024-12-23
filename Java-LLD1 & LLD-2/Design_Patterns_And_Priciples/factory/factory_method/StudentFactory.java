package Design_Patterns_And_Priciples.factory.factory_method;


import Design_Patterns_And_Priciples.factory.factory_method.models.Student;
import Design_Patterns_And_Priciples.factory.factory_method.models.User;

// concrete factory for creating student object
public class StudentFactory implements UserFactory{
    @Override
    public User createUser(String name, String age) {
        return new Student(name, age);
    }
}
