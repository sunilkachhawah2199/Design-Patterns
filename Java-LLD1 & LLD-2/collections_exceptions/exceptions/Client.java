package collections_exceptions.exceptions;

public class Client {
    public static void main(String[] args) {
        Student s=new Student();
        try {
            s.setAge(17);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
