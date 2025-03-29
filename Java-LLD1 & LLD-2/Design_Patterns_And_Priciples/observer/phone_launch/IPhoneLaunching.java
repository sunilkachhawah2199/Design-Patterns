package Design_Patterns_And_Priciples.observer.phone_launch;

import java.util.ArrayList;
import java.util.List;

public class IPhoneLaunching implements Launching {
    IPhoneObserver iPhoneObserver=new IPhoneObserver();
    List<User> interestedUsers=new ArrayList<>();
    @Override
    public void add(User user) {
        interestedUsers.add(user);
    }
    @Override
    public void remove(User user) {
        interestedUsers.remove(user);
    }
    @Override
    public void notifyUser() {
        for(User user:interestedUsers){
            iPhoneObserver.notify(user, "New IPhone Launch");
        }
    }
}
