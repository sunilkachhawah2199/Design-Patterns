package LLD_1_Part_2.collections_exceptions.lambda;

public class Client {
    public static void main(String[] args) {
        // implementing abstract method
        Functional fun=new Functional() {
            @Override
            public void fly() {
                System.out.println("I am flying silently");
            }
        };
        fun.fly();

        // same work using LLD_1_Part_2.lambda
        Functional fun2=()->{
            System.out.println("Hello I am flying using LLD_1_Part_2.lambda");
        };

        fun2.fly();

        // Runable also a Functional Interface so we can use LLD_1_Part_2.lambda
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("I am runable wihtout LLD_1_Part_2.lambda");
            }
        };

        Thread t1=new Thread(r);
        t1.start();


        // Runnable using LLD_1_Part_2.lambda
        Runnable r2=()->{
            System.out.println("I am labbda runable");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
