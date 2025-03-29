package Design_Patterns_And_Priciples.observer.phone_launch;

import Design_Patterns_And_Priciples.observer.bitcoin_tracker.Observer;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("John", "jkjfsd");
        User user2 = new User("Doe", "fhsdkjfh");

        Launching phone=new IPhoneLaunching();
        phone.add(user1);
        phone.add(user2);
        phone.notifyUser();
    }
}
