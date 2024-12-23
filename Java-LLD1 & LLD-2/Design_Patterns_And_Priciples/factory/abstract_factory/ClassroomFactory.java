package Design_Patterns_And_Priciples.factory.abstract_factory;

import Design_Patterns_And_Priciples.factory.abstract_factory.models.Student;
import Design_Patterns_And_Priciples.factory.abstract_factory.models.Teacher;
import Design_Patterns_And_Priciples.factory.abstract_factory.models.User;

public interface ClassroomFactory {
    public Student createStudent(String name, String age);
    public Teacher createTeacher(String name, String age);
}
