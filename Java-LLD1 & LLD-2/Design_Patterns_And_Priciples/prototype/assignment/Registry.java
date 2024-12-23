package Design_Patterns_And_Priciples.prototype.assignment;

import java.util.HashMap;

public class Registry implements ConfigurationPrototypeRegistry{

    private HashMap<ConfigurationType, Configuration> hm=null;
    private Registry(){
        if(hm==null){
            hm=new HashMap<>();
        }
    }

    @Override
    public void addPrototype(Configuration user) {
        hm.put(user.getType(), user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return hm.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration user=hm.get(type);
        return user.cloneObject();
    }
}
