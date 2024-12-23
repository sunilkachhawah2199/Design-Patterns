package Design_Patterns_And_Priciples.decorator.notification_service;

// this is interface for basic operations of notification service
public interface Communicator {
    public void send(String email, String message);
}
