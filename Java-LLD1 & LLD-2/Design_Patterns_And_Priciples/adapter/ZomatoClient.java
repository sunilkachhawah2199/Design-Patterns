package Design_Patterns_And_Priciples.adapter;

public class ZomatoClient {
    public static void main(String[] args) {
        EmailAdapter emailAdapter= new Sendgrid();
        emailAdapter.sendEmail("Sunil","Anil","Hello");

        EmailAdapter emailAdapter1=new Sendgrid();
        emailAdapter1.sendEmail("Sunil", "Anil", "Hello");

        // if we use another library in future then we have no need to modify our sendEmail method it will work for all
    }
}
