package Design_Patterns_And_Priciples.factory.factory_method;

import Design_Patterns_And_Priciples.factory.factory_method.models.User;

public class Client {
    public static void main(String[] args) {
        UserFactory studentFactory = new StudentFactory();
        User student = studentFactory.createUser("John", "20");

        UserFactory teacherFactory = new TeacherFactory();
        User teacher = teacherFactory.createUser("Jane", "50");

        System.out.println(teacher.toString());
    }
}
