package Design_Patterns_And_Priciples.factory.factory_method.models;

public abstract class User {
    private String name;
    private String age;
    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
