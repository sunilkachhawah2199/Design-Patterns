package Design_Patterns_And_Priciples.factory.abstract_factory;

import Design_Patterns_And_Priciples.factory.abstract_factory.models.*;

public class BiologyClassroomFactory implements ClassroomFactory {
    @Override
    public Student createStudent(String name, String age) {
        return new BilologyStudent(name, age);
    }
    @Override
    public Teacher createTeacher(String name, String age) {
        return new BiologyTeacher(name, age);
    }
}
