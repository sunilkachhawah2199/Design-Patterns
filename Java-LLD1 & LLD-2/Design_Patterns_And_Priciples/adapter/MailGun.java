package Design_Patterns_And_Priciples.adapter;

public class MailGun implements EmailAdapter{
    MailGun mailGun;
    @Override
    public void sendEmail(String from, String to, String content) {
        // real emhtod of that class
        mailGun=new MailGun();
        mailGun.send(to, from, content);
    }

    public void send(String to, String from, String content){
        System.out.println("mail was sent to "+to+" from "+from);
    }
}
