package Design_Patterns_And_Priciples.decorator.notification_service;

public class Client {
    public static void main(String[] args) {
        // first we need base service
        Communicator emailService = new Emailservice();
        // now we can decorate this service with other services
        Communicator phoneService = new PhoneService(emailService);
        phoneService.send("phone", "message");
    }
}