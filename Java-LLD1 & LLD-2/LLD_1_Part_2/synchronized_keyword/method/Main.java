package LLD_1_Part_2.synchronized_keyword.method;

public class Main {
    public static void main(String[] args) throws Exception{
        Count c=new Count(0);

        Adder adder=new Adder(c);
        Subtractor sub=new Subtractor(c);



            Thread add=new Thread(adder);
            Thread su=new Thread(sub);
            add.start();
            su.start();
            add.join();
            su.join();


        System.out.println("final " +c.num);
    }
}
