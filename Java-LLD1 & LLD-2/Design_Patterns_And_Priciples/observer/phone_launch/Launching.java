package Design_Patterns_And_Priciples.observer.phone_launch;

import Design_Patterns_And_Priciples.observer.bitcoin_tracker.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Launching {
    public void add(User user);

    public void remove(User user);

    public void notifyUser();
}
