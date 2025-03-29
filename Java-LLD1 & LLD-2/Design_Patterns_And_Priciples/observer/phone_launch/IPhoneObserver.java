package Design_Patterns_And_Priciples.observer.phone_launch;

public class IPhoneObserver implements Observers{
    Email email;
    @Override
    public void notify(User user, String message) {
        email = new Email(user.email,
                "New IPhone Launch",
                message, "Apple");
        email.sendEmail();
    }
}