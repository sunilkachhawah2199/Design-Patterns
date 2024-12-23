package Design_Patterns_And_Priciples.prototype.assignment;

public interface ConfigurationPrototypeRegistry {
    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}
