package Design_Patterns_And_Priciples.prototype;

public class Client {
    public static void main(String[] args) throws Exception{
        Student s =new Student("Sunil", 25);
        Student s2=s.clone();
        System.out.println(s2);
        System.out.println(s);

        Student s3=new IntellignetStudent("Anil", 15, 95);
        Student s4=s3.clone();
        System.out.println(s4.getClass().getName());

        // registry pattern

        StudentRegistry sr= StudentRegistry.getInstance();
        sr.add("1", s4);

        // runnable task --> checking single instance is created of registry object.
        Runnable task=() -> {
            StudentRegistry instance= StudentRegistry.getInstance();
            System.out.println("instance hashcode"+ instance.toString());
        };


        // checking registry object is single or not
        for(int i=1;i<10;i++){
            Thread t= new Thread(task);
            t.start();
            t.join();
        }


        System.out.println(sr.get("1"));
        System.out.println("task completed");
    }
}
