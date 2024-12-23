package Design_Patterns_And_Priciples.factory.abstract_factory.models;

public class MathsTeacher extends Teacher {
    private String role = "Maths Teacher";
    public MathsTeacher(String name, String age) {
        super(name, age);
    }
}
