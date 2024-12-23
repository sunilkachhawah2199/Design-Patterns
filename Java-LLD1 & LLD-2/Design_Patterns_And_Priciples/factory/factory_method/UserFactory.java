package Design_Patterns_And_Priciples.factory.factory_method;


import Design_Patterns_And_Priciples.factory.factory_method.models.User;

// this is a base interface for user factory
public interface UserFactory {
    public User createUser(String name, String age);
}
