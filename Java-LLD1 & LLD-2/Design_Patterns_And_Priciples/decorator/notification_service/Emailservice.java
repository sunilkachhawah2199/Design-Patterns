package Design_Patterns_And_Priciples.decorator.notification_service;

// Email is core service which will be used to send message and this service can be decorated with other services
public class Emailservice implements Communicator {
    public void send(String email, String message) {
        System.out.println("Email sent with message: " + message);
    }
}
