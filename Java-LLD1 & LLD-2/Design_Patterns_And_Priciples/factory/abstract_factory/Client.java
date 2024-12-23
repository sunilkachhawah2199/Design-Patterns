package Design_Patterns_And_Priciples.factory.abstract_factory;

import Design_Patterns_And_Priciples.factory.abstract_factory.models.Student;

public class Client {
    public static void main(String[] args) {
        ClassroomFactory bioClass=new BiologyClassroomFactory();
        Student student=bioClass.createStudent("John", "12");
        bioClass.createTeacher("Mr. Smith", "45");
        System.out.println(student.toString());
    }
}
