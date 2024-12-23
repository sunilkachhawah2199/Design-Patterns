package Design_Patterns_And_Priciples.decorator.notification_service;

// this is abstract class of decorator
// take other communicator as input and decorate it with additional functionality
public abstract class CommunicatorDecorator implements Communicator{
    protected Communicator baseCommunicator;
    public CommunicatorDecorator(Communicator baseCommunicator){
        this.baseCommunicator = baseCommunicator;
    }
}
