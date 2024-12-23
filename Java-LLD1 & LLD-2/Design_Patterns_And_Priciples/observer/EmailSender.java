package Design_Patterns_And_Priciples.observer;

public class EmailSender implements Observer {
    @Override
    public void notifyChange() {
        System.out.println("Email sent to the user");
    }
}
