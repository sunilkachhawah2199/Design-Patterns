package Design_Patterns_And_Priciples.decorator.notification_service;


// this is phone communication which can be used with base communicator
public class PhoneService extends CommunicatorDecorator {
    public PhoneService(Communicator baseCommunicator) {
        super(baseCommunicator);
    }

    @Override
    public void send(String phone, String message) {
        baseCommunicator.send(phone, message);
        System.out.println("Sending message through phone");
    }
}
