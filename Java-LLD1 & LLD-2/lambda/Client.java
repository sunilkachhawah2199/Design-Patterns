package lambda;



public class Client {
    public static void main(String[] args) {
        // we defined methods using anonymous class concept
        // we use anonymous class to temporary override of functional interface method
        Student s1 =new Student() {
            @Override
            public void run() {
                System.out.println("this is a Student");
            }
        };
        s1.run();

        // declare anonymous class using lambda
        Student s2 = ()->{
            System.out.println("hello");
        };
        s2.run();

        // runnable using anonymous class
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a new thread using anonymous class");
            }
        };
        Thread t=new Thread(r);
        t.start();


        // runnable using lambda
        Runnable r2=()->{
            System.out.println("runable using lambda expression");
        };

        Thread t2=new Thread(r2);
        t2.start();


        // NumOperation using lambda
        // expression with parameter
        NumOperation add= (a, b)->{
            return (a+b);
        };

        int ans= add.print(5,4);
        System.out.println(ans);
    }
}
