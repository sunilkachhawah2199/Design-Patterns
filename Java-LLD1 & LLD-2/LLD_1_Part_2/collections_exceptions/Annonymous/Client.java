package LLD_1_Part_2.collections_exceptions.Annonymous;

public class Client {
    public static void main(String[] args) {
        Annonymous an=new Annonymous();
        an.print();

        // Now I want to print Lion but use is only 1 time then I will use anonymous class concept
        // we can override multiple method using anonymous class concept
        Annonymous ann=new Annonymous(){
            public void print(){
                System.out.println("Now I am a lion");
            }
        };

        ann.print(); // not this will print lion

    }
}
