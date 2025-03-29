package Design_Patterns_And_Priciples.observer.phone_launch;

public class Email {
    public String to;
    public String subject;
    public String body;
    public String from;
    public Email(String to, String subject, String body, String from){
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.from = from;
    }
    public void sendEmail(){
        System.out.println("Email sent to: "+to);
        System.out.println("Subject: "+subject);
        System.out.println("Body: "+body);
        System.out.println("From: "+from);
    }
}
