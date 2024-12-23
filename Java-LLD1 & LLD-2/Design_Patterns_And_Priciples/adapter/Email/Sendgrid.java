package Design_Patterns_And_Priciples.adapter.Email;

public class Sendgrid implements EmailAdapter {
    Sendgrid sendgrid;
    @Override
    public void sendEmail(String from, String to, String content) {
        sendgrid=new Sendgrid();
        sendgrid.send(content,from,to);
    }

    // now order of library method will not affect our code
    public void send(String content, String from, String to){
        System.out.println("mail was sent to "+to+" from "+from);
    }
}
