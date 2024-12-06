package LLD_1_Part_2.lambda;


import java.util.*;

public class Client {
    public static void main(String[] args) {
        // we defined methods using anonymous class concept
        // we use anonymous class to temporary override of functional interface method
        // syntax: (argument without data type) -> { no retrun word is need};
        Student s1 =new Student() {
            @Override
            public void run() {
                System.out.println("this is a Student");
            }
        };
        s1.run();

        // declare anonymous class using LLD_1_Part_2.lambda
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


        // runnable using LLD_1_Part_2.lambda
        Runnable r2=()->{
            System.out.println("runable using LLD_1_Part_2.lambda expression");
        };

        Thread t2=new Thread(r2);
        t2.start();


        // NumOperation using LLD_1_Part_2.lambda
        // expression with parameter
        NumOperation add= (a, b)->{
            return (a+b);
        };

        int ans= add.print(5,4);
        System.out.println(ans);

        //------------------
        Runnable rr=() ->{
            System.out.println("hello");
        };

        Human h1=new Human(1,"Sunil");
        Human h2=new Human(2, "Anil");
        Human h3=new Human(3, "Ravi");

        List<Human> humans=new ArrayList<>();
        humans.add(h1);
        humans.add(h2);
        humans.add(h3);

        // sort in descending by age
        Comparator<Human> comp =(f, s)-> s.age-f.age;
        Collections.sort(humans, comp);
        printH(humans);
    }

    public static void printH(List<Human> humans){
        for (int i=0;i<humans.size();i++){
            System.out.println(humans.get(i).age+" "+humans.get(i).name);
        }
    }
}
