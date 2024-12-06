package LLD_1_Part_2.collections_exceptions.exceptions;

public class Client {
    public static void main(String[] args) throws CustomException{
        Student s=new Student();
        try {
            s.setAge(21);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
