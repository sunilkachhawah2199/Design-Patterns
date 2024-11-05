package collections_exceptions.lambda;

import javax.print.attribute.standard.RequestingUserName;

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

        // same work using lambda
        Functional fun2=()->{
            System.out.println("Hello I am flying using lambda");
        };

        fun2.fly();

        // Runable also a Functional Interface so we can use lambda
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("I am runable wihtout lambda");
            }
        };

        Thread t1=new Thread(r);
        t1.start();


        // Runnable using lambda
        Runnable r2=()->{
            System.out.println("I am labbda runable");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
